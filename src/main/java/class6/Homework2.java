package class6;

import java.util.Scanner;

public class Homework2 {
   /*
   Ask user to enter a number and then define if number is small, medium or large
    Small number is value between 1 and 10
    Medium number is value between 11 and 100
    Large number is value between 101 and 1000

    */
   public static void main(String[] args) {
       Scanner number=new Scanner(System.in);
       System.out.println("Enter a number:");
       int value=number.nextInt();

       if (value>=1 && value<=10){
           System.out.println("Small number");
       } else if (value>=11 && value<=100 ) {
           System.out.println("Medium number");
       }else if (value>=101 && value<=1000){
           System.out.println("Large number");
       }else {
           System.out.println("Invalid number");
       }
   }
}
