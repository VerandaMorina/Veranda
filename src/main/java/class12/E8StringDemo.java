package class12;

import java.util.Locale;

public class E8StringDemo {
    public static void main(String[] args) {
        String sentence="JAVA is very very easy";
        //method chaining and is possible in String class
        sentence=sentence.trim().toLowerCase();
        System.out.println(sentence);

        String searchWord="Java";
        System.out.println(sentence.startsWith("java"));
    }
}
