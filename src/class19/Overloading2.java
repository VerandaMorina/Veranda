package class19;

public class Overloading2 {
    //Create 1 class with a static method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.

    static void add(String word1, int num2) {
        System.out.println(word1 + " is " + num2 + " years old");
    }

    static void add(String word2, String word3) {
        System.out.println(word2 + " " + word3);
    }

    static void add(int num1, String word4) {
        System.out.println(num1 + " " + word4);
    }

    public static void main(String[] args) {
        add("Veranda", 28);
        add("Syntax", "Technologies");
        add(16, "BATCH");

    }
}
