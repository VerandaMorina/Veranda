package class19;

public class Math {

    static void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    static void add(int num1,double num2){
        System.out.println(num1+num2);
    }
    static void add(double num1,double num2){
        System.out.println(num1+num2);
    }
// we must have different data types of parameters if we want to use the same name for methods
    public static void main(String[] args) {
        add(10,20.4);
        add(10.3,5.6);
    }
}
