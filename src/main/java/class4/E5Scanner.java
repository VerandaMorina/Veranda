package class4;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {

        /*
        scanner is a class(wich knows how to take input from keyboard)
        scan is a variable of time scanner just like we create a variable of type String
        new = is a special keyword wich create the object of a class
        Scanner again with ()
        System.in = wich means we want to use the scanner class for taking the user input
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your name");
        //calling the next method to take a aString from the user
        String name=scan.next();
        System.out.println("you are amazing "+name);
    }
}
