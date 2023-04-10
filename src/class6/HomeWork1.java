package com.syntax.review2;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        //1.we need to create Scanner

        Scanner days=new Scanner(System.in);
        System.out.println("Enter day of the week");
        int weekdays= days.nextInt();

        if (weekdays <=5 && weekdays >=1) {
            System.out.println("It is weekday");
        }else if (weekdays == 6 || weekdays == 7) {
            System.out.println("It is weekend");
        } else {
            System.out.println("Invalid day");
        }

    }
}