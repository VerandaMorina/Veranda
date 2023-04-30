package class15;

public class E4 {
    public static void main(String[] args) {
        if (10>20){
            int sum=10;  //local to if condition
            System.out.println(sum);//local it can only be access inside that block of code
        }
    }
    String name;//outside of the method are called instance variables
    static int age; //its static variable we cant do it inside main
}
