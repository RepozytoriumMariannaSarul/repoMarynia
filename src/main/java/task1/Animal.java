package task1;

public class Animal implements Sellable{
    private String species;
    private Double weight;

    public Animal(String species) {
        this.species = species;
        if (species.equals("dog")) {
            this.weight = 10d;
        } else if (species.equals("cat")) {
            this.weight = 3d;
        } else {
            this.weight = 20d;
        }
    }

    public void feed() {

        if (this.weight <= 0) {
            printCatIsDead();
        } else {
            this.weight = this.weight + 1;
            System.out.println("Fed " + this.species + ". Current weight: " + this.weight);
        }
    }

    public void takeForAWalk() {
        if (this.weight <= 0) {
            printCatIsDead();
        } else {
            this.weight = this.weight - 1;
            System.out.println(this.species + " taken for a walk. Current weight: " + this.weight);
            if (this.weight <= 0) {
                printCatIsDead();
            }
        }
    }

    private void printCatIsDead() {
        System.out.println(this.species + " is dead");
    }

    @Override
    public void sell(Human seller, Human buyer, double price) {
        if(seller.getPet() != this){
            throw new IllegalStateException("to nie jest zwierzę sprzedającego");
        }
        if(buyer.getCash() < price){
            throw new IllegalStateException("kupujący nie ma wystarczająco pieniędzy");
        }
        System.out.printf(
                "Przystepuje do sprzedazy zwierzecia za cene %s. Sprzedajacy ma %s pieniedzy kupujacy ma %s pieniedzy%n",
                price, seller.getCash(), buyer.getCash());
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        seller.setPet(null);
        buyer.setPet(this);
        System.out.printf(
                "Sprzedano zwierze. Sprzedajacy ma %s pieniedzy kupujacy ma %s pieniedzy%n",
                seller.getCash(), buyer.getCash());
    }
}
