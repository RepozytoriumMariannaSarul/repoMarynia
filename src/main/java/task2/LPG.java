package task2;

public class LPG extends Car{
    public LPG(String model, String producer, int yearOfProduction, String color) {
        super(model, producer, yearOfProduction, color);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowałem gazem.");
    }
}
