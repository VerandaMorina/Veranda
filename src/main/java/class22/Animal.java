package class22;
/*
Create 3 animals like dog cate horse
define 3 common methods in each class like sleep eat and speak
create the object of all the classes and call the methods

if its not clear what we want to use in method we can use abstract
when we have abstract method we need to declare that class abstract as well
we can have abstract and not abstract methods in the same class
 final private String name; means once we assign the name we cant change it anymore

 */



public abstract class Animal {

    abstract void speak();
    abstract void eat();
     abstract void sleep();
}
class Dog extends Animal{
    @Override
    void speak(){
        System.out.println("Woof Woof");
    }
    @Override
    void eat(){
        System.out.println("Chewing bones");
    }
    void sleep(){
        System.out.println("Sleeping ZZZzzzzZZZ");
    }
}
class Cat extends Animal{
    @Override
    void speak(){
        System.out.println("Meow Meow");
    }
    @Override
    void eat(){
        System.out.println("Eating fish");
    }
    void sleep(){
        System.out.println("Sleeping ZZZzzzzZZZ");
    }
}
