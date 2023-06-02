package class17;

public class Task1 {
    String name;

    Task1(String nameOf){
        name=nameOf;
    }
    Task1(){
        System.out.println("0 parameters");
    }
    void printInfo(){
        System.out.println(name);
    }
    public static void main(String[] args) {

        Task1 name1=new Task1("Tomy");
        name1.printInfo();
        Task1 name2=new Task1();
        name2.printInfo();
    }
}
