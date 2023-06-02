package class6;

import java.util.Scanner;

public class HomeWork7 {
    /*
    Allow user to enter grade (A, B, or C etc...) and then provide explanation:
     A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
     At the end your program should print which grade was entered by a user with explanation.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your grade:");
        char grade=scan.next().charAt(0);



        switch (grade) {
            case 'A':
            System.out.println("A-Excellent");
            break;
            case 'B':
                System.out.println("B-Good");
                break;
            case 'C':
                System.out.println("C-Average");
                break;
            case 'D':
                System.out.println("D-Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }
    }
}
