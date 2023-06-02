package class4;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age");

        int age = scanner.nextInt();
        if (age>=18) {
            System.out.println("We will issue a driver license");
        } else {
            System.out.println("We can offer you a learners permit");
        }
    }
}
