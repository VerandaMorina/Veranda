package class12;

public class DogTester {
    public static void main(String[] args) {

        Dog actualDog= new Dog();
        actualDog.name="Jacky";
        actualDog.age=50;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;


        actualDog.bark();

        Dog obj=new Dog();
        obj.name="Luna";
        obj.age=30;
        obj.breed="German";
        obj.color="Brown";
        obj.weight=40;
        obj.sleep();
    }
}
