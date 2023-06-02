package class17;

public class Dog {
    String name;
    String color;
    String breed;
    int age;

    //constructor is always the same as the name of class
    Dog(String dogName,String dogColor,String dogBreed,int dogAge){
        name=dogName;
        color=dogColor;
        breed=dogBreed;
        age=dogAge;
    }
    void print(){
        System.out.println(name+ " "+color+" "+breed+" "+age);
    }
}
