package task2;

public class Diesel extends Car{
    public Diesel(String model, String producer, int yearOfProduction, String color) {
        super(model, producer, yearOfProduction, color);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowałem ropą.");
    }
}
