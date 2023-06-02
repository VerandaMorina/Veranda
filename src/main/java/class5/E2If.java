package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
        //below code helps us get any type of data inside the console
        Scanner input=new Scanner(System.in);
        //print the text inside the "" in the console
        System.out.println("Is it time for break true/false");
        /*
        boolean isBreak=> we are vreating a variable of type boolean
        and calling is isBreak
        input is also a variable of type scanner
        nextBoolean()=>this is a method that helps
         */
        boolean isbreak=input.nextBoolean();
        if (isbreak){//true/false
            System.out.println("Lets have a break");
        }
    }
}
