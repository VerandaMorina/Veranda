package class17;

public class Zebra {
    //instance variables
    String name;
    String color;
    int age;
    double weight;

    public Zebra(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }
    void printInfo(){
        System.out.println(name+" "+color+" "+age+" "+weight);
    }

    //if instance variables are not involved you can go with static
   static void speek(){
        System.out.println("mooooo boahhhhaaaa");
    }
}
