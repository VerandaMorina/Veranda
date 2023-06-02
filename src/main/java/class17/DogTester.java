package class17;

public class DogTester {
    public static void main(String[] args) {
        /*
        Dog dog1=new Dog();
        dog1.name="Husky";
        dog1.breed="German";
        dog1.age=12;
        dog1.color="black";
        dog1.print();

        Dog dog2=new Dog();
        dog2.name="Nina";
        dog2.breed="German";
        dog2.age=14;
        dog2.color="grey";
        dog2.print();

        Dog dog3=new Dog();
        dog3.name="Luna";
        dog3.breed="German";
        dog3.age=10;
        dog3.color="white";
        dog3.print();

        Dog dog4=new Dog();
        dog4.name="Leo";
        dog4.breed="German";
        dog4.age=6;
        dog4.color="black";
        dog4.print();

        Dog dog5=new Dog();
        dog5.name="";
        dog5.breed="German";
        dog5.age=20;
        dog5.color="black";
        dog5.print();

         */
        Dog dog1=new Dog("Jack","White","German",2);
        Dog dog2=new Dog("Luna","Black","Persian",13);
        Dog dog3=new Dog("Fluffy","Pink","British",7);
        Dog dog4=new Dog("Leo","Grey","German",20);
        dog1.print();
        dog2.print();
        dog3.print();
        dog4.print();


    }
}
