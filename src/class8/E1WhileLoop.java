package class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the Starting point Ending point and the step");
        int start= scan.nextInt();
        int end= scan.nextInt();
        int step= scan.nextInt();
       // int number=start;



        while (start<=end){
        System.out.println(start+ " ");
        start=start+step;
}

    }
    }

