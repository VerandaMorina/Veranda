package class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you Hungry Enter true/false");
        boolean hungry=scanner.nextBoolean();
        if (hungry){
            System.out.println("lets order pizza");
        }else {
            System.out.println("Lets practice java");
        }
    }
}
