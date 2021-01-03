package task1;

import device.Device;

public class Phone extends Device {
    private static final int VERSION = 1;
    private static final String SERVER_URL = "www.go.com";
    private String number;
    private String mobile;

    public Phone(String model, String producer, int yearOfProduction){
        super(model, producer, yearOfProduction);
    }

    public void turnOn(){
        System.out.println("Ring");
    }

    public void installAnApp(String name){
        installAnApp(name, VERSION);
    }
    public void installAnApp(String name, int version){
        installAnApp(name, version, SERVER_URL);
    }
    public void installAnApp(String name, int version, String serverUrl){
        System.out.printf("Instaluję aplikację %s w wersji %s z serwera %s%n", name, version, serverUrl);
    }
}
