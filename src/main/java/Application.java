import task1.Animal;
import task1.Human;
import task1.Phone;
import task2.Car;

public class Application {
    public static void main(String[] args){
        System.out.println("Hello world");

        Animal pet1 = new Animal("cat");
        Human person1 = new Human("Krzysio", 29);
        person1.setPet(pet1);
        pet1.feed();
        pet1.feed();


        pet1.takeForAWalk();
        pet1.takeForAWalk();
        pet1.takeForAWalk();
        pet1.takeForAWalk();
        pet1.takeForAWalk();
        pet1.takeForAWalk();
        pet1.takeForAWalk();
        pet1.feed();


        Car car1 = new Car("125p", "fiat" );
        person1.setCar(car1);













    }
}
