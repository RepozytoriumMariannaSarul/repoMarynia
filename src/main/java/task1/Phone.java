package task1;

import device.Device;

public class Phone extends Device {
    private String number;
    private String mobile;

    public Phone(String model, String producer, int yearOfProduction){
        super(model, producer, yearOfProduction);
    }
    public void turnOn(){
        System.out.println("Ring");
    }

}
