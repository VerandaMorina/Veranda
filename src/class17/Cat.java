package class17;

public class Cat {
    String name;
    Cat(String catName){
        name=catName;
    }
    void printInfo(){
        System.out.println(name);
    }
    public static void main(String[] args) {

        Cat cat=new Cat("Tomy");
        cat.printInfo();
    }
}
