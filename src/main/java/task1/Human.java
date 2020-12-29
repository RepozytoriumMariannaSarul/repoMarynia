package task1;
import task2.Car;

public class Human {
    private final String name;
    private final int age;
    private Animal pet;
    private Car car;
    public double salary;


    public void setPet(Animal pet){
        this.pet = pet;
    }
    public Animal getPet(){
        return this.pet;
    }

    public void setCar(Car car){
        this.car = car;
    }
    public Car getCar(){
        return this.car;
    }



    public Human(String name, int age){
        this.name = name;
        this.age = age;



    }
    public Human getSalary(){
        return this.getSalary();
    }
}
