package class6;

import java.util.Scanner;

public class HomeWork5 {
    /*
     Write a program that will read three inputs of scores (quiz, mid term, and final scores)
     and determine the grade based on the following rules:
     if the average score >=90 → grade=A
     if the average score >= 70 and <90 → grade=B
     if the average score>=50 and <70 → grade=C
     if the average score<50 → grade=F
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter quiz scores");
        int quiz=scan.nextInt();
        System.out.println("Enter mid term scores");
        int midTerm= scan.nextInt();
        System.out.println("Enter your final scores");
        int finalScore= scan.nextInt();
        int grade=(finalScore+quiz+midTerm)/3;

        if (grade>=90){
            System.out.println("Grade A");
        } else if (grade>=70 || grade<90) {
            System.out.println("Grade B");
        } else if (grade>=50 || grade<70) {
            System.out.println("Grade C");
        }else if (grade<50){
            System.out.println("Grade F");
        }

    }
}
