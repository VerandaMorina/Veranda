package GroupProject2;

import java.util.stream.Stream;

public class Task3 {
    /*
    Count the Number of Words in a String: Write a function to count the
    number of words in a given string. Words are separated by spaces or
    punctuation. For example, the input "Hello, world!" should return 2.
     */
    public static void main(String[] args) {
        String str = "Hello, world!";

        int count = 1;

        for (int i = 0; i < str.length() - 1; i++)
        {
            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != '!'))
            {
                count++;
            }
        }
        System.out.println("Number of words in a string : " + count);
    }

}

