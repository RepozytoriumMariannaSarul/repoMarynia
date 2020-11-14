package task1;

public class Animal {
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
}
