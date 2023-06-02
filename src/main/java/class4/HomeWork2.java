package class4;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the amount of loan needed");

        int loan = scanner.nextInt();
        if (loan<=200000) {
            System.out.println("Your loan is approved");
        } else {
            System.out.println("The loan is denied");
        }
    }
}
