package task2;


import device.Device;

public class Car extends Device {

    private final String color;


    public Car(String model, String producer, int yearOfProduction, String color){
        super(model, producer, yearOfProduction);
        this.color = color;
    }
    public void turnOn(){
        System.out.println("BRRR");
    }
    @Override
    public String toString() {
        return super.toString() + ", color =" + this.color;
    }
}
