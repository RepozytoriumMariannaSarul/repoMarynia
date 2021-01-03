package task1;
import task1.creatures.Animal;
import task2.Car;

public class Human {
    private final String name;
    private final int age;
    private Animal pet;
    private Car car;
    public double cash;


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

    public void setCash(double cash){
        this.cash = cash;
    }
    public double getCash(){
        return this.cash;
    }



    public Human(String name, int age){
        this.name = name;
        this.age = age;



    }
    public Human getSalary(){
        return this.getSalary();
    }
}
