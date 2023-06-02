package class6;

import java.util.Scanner;

public class Homework3 {
    /*
    Write a program that will ask user to input inputs the current time (use 24 hour format).
    Based on the given time define:
    if hour is between 1-11 --> Morning
    if hour between 12-15 --> Afternoon
    if hour between 16-20 --> Evening
    if hour between 21-24 --> Night
     */
    public static void main(String[] args) {
        Scanner hour=new Scanner(System.in);
        System.out.println("What is the current time:");
        double time= hour.nextDouble();

        if (time>=1.00 && time<=11.00){
            System.out.println("Morining");
        } else if (time>=12.00 && time<=15.00) {
            System.out.println("Afternoon");
        } else if (time>=16.00 && time<=20.00) {
            System.out.println("Evening");
        } else if (time>=21.00 && time<=24.00) {
            System.out.println("Night");
        }else {
            System.out.println("Incorrect time");
        }
    }

}
