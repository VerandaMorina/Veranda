package GroupProject;

public class Task7 {
    /*
    Write a Java Program to print the first 10 numbers of Fibonacci series.
     */
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        int num3=1;


        while (num1<=80){
            num1=num2+num3;
            System.out.print(num1+" ");
            num2=num3;
            num3=num1;
        }
    }
}
