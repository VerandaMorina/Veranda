package class18;

public class ClassA{
   static void printF(){
        System.out.println(".......");
    }
}
class ClassB extends ClassA {



}
class ETester{
    public static void main(String[] args) {
        ClassB.printF();
    }
}