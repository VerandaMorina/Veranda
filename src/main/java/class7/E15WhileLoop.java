package class7;

import java.util.Scanner;

public class E15WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number starting from 1");
        int lastNumber= scan.nextInt();//last number that fill be printed from the user

        int number=1; //starting point
        while (number<=lastNumber){//when number 1 is smaller then the number from the user
            System.out.println(number+" ");
            number++; // number increase till the number printed by user input
        }
    }
}
