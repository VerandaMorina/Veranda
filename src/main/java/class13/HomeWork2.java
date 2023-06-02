package class13;

public class HomeWork2 {
    public static void main(String[] args) {
        /*
        How would you check if String is palindrome or not? aba=> true
        Abbc =>false
         */
        String str2 = "Abbc";
        String str = "aba";
        StringBuilder word = new StringBuilder(str);
        word.reverse();
        System.out.println(str.equals(word.toString()));
        StringBuilder word2 = new StringBuilder(str2);
        word2.reverse();
        System.out.println(str2.equals(word2.toString()));
    }

}
