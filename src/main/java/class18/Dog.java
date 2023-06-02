package class18;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;


    Dog (String name,String color,String breed,int age,double weight){

        //calling the constructor from the same class wich takes name color breed age as parameters
        this(name, color, breed, age);
        this.weight=weight;
    }
    Dog (String name,String color,String breed,int age){
        this(name, color, breed);
        this.age=age;
        /*
        this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;

         */
    }
    Dog (String name,String color,String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;

    }
}
