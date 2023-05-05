package class16;

public class Dog {
    String name;
    String color;
    String breed;

    static int age;
    void bark(){
        System.out.println(name+" is barking");
    }
    void printInfo(){
        if (breed.equals("German")){
            System.out.println(name+" "+color+" i can work in NYPD");
        }else {
            System.out.println(name+" can be used as a pet");
        }
    }
    static void printInfo2() {
        if (age < 19) {
            System.out.println("Young dog");
        } else {
            System.out.println("Old dog");
        }
    }
}
