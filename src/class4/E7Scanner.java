package class4;

import java.util.Scanner;

public class E7Scanner {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scann.next();

        if (name.equals("Veranda")) {
            System.out.println("Mac user");
        } else if (name.equals("Elena")) {
            System.out.println("Naughty");
        } else if (name.equals("Halima")) {
            System.out.println("Best");
        } else if (name.equals("Axel")) {
            System.out.println("Bad boy");
        }
    }
}