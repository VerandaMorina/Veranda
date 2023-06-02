package GroupProject2;

import java.util.Scanner;

public class Task1 {
    /*
    Reverse a String: Write a function to reverse a given string. For
    example, given the input "Hello", the output should be "olleH".
    */

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            char[] arr = text.toCharArray();
            for(int i=arr.length-1;i>=0;i--)
            {
                System.out.print(arr[i]);
            }

        }

}
