package class4;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {

        double celsius, fahrenheit;
        Scanner scanner=new Scanner(System.in);
        System.out.print("What is the temperature in your city:");
        fahrenheit =scanner.nextDouble();
        celsius = (fahrenheit-32)*(0.5556);
        String name = scanner.next();
        System.out.println("The temperature in "+name+ " is "+celsius);


    }
}
