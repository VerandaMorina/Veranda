package class20;

public class Animal {

    // this is creating a field//properties/attributes/instance variables
    String name;
    int years;
    String breed;


    // these are the constructers
    public Animal(String name, int years, String breed) {
        this.name = name;
        this.years = years;
        this.breed = breed;
    }


    //these are the methods
    public void isEating() {
        System.out.println(name + " Eating....");
    }

    public void isBark() {
        System.out.println(name + " Barking...");
    }

    public void isSleep() {
        System.out.println(name + " is sleeping...");
    }


}

class Dog extends Animal {
    public Dog(String name, int years, String breed) {
        super(name, years, breed);
    }
    @Override
   public void isSleep(){//this is called method overriding
        System.out.println("I like to sleep for 10.6 hours a day");
    }
}

class Cat extends Animal {
    public Cat(String name, int years, String breed) {
        super(name, years, breed);
    }
}



class Horse extends Animal {
    public Horse(String name, int years, String breed) {
        super(name, years, breed);
    }
}

class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Husky", 10, "German");//objects
        //dog.isSleep();//calling the methods
        Cat cat = new Cat("Luna", 12, "German");
        //cat.isEating();
        Horse horse = new Horse("Doni", 3, "British");
        //horse.isSleep();
        dog.isSleep();
    }
}