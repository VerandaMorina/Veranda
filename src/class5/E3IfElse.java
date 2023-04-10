package class5;

import java.util.Scanner;

public class E3IfElse {
    /*
    Ask the user for the age and based on the value of age
    write an if-condition if age is <18 print you cant drive
    otherwise we have to print you can drive
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your age?");
        int age= scanner.nextInt();
        if (age<18){
            System.out.println("You cant drive");
        }else{
            System.out.println("You can drive");
        }
    }
}
