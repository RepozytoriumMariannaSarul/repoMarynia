package task2;

public class Electric extends Car{
    public Electric(String model, String producer, int yearOfProduction, String color) {
        super(model, producer, yearOfProduction, color);
    }

    @Override
    public void refuel() {
        System.out.println("Naładowałem samochód.");
    }
}
