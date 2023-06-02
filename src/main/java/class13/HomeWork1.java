package class13;

import java.util.Stack;

public class HomeWork1 {
    /*
    How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
     */
    public static void main(String[] args) {
        String str = "The sentence i want to reverse";

        String[] words = str.split(" ");
        String reverseString = "";

        for (String word : words) {
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + word.charAt(i);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println(reverseString);
    }
}
