package GroupProject2;

public class Task2 {
    /*
    Check if a String is Palindrome: Determine whether a given string is
    a palindrome, which means it reads the same forwards and
    backward. For example, "madam" is a palindrome.
     */
    public static void main(String[] args) {

        String s = "madam";
        String rev = "";
        for (int i = s.length()-1; i >=0 ; i--)
            rev=rev+s.charAt(i);
        if(s.equals(rev))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

    }
}
