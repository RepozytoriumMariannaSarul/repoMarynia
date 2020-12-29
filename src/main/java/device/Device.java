package device;

public class Device {
    private final String model;
    private final String producer;
    private final int yearOfProduction;

    public Device(String model, String producer, int yearOfProduction){
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }


    @Override
    public String toString() {
        return "model = " + this.model + ", producer = " + this.producer + ", Year of production: " + this.yearOfProduction;
    }

}
