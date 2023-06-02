package class6;



import java.util.Scanner;

public class HomeWork6 {
    /*
    Ask user to enter their country and capture it.
     Once values are captured print which language user speaks.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your Country");
        String country= scan.next();

        if (country.equals("Albania")){
            System.out.println("You speak Albanian");
        } else if (country.equals("United States")) {
            System.out.println("You speak English");
        } else if (country.equals("Germany")) {
            System.out.println("You speak German");
        }
    }

}
