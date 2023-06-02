package class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        //ask user to enter numbers if user enters any number
        //other then -1 print "Try again" and keep asking the user for a number
        //the moment user enters the number -1 the loop should stop

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= scan.nextInt();

        while (number!=-1){
            System.out.println("Try Again");
            number=scan.nextInt();
        }



    }
}
