package class16;


public class HW1 {
    /* Create a method that will take a String as a parameter
    and returns reversed String. Method should be available to all
    classes within your project and accessible by class name.
     */

    public String reverseString (String s){
        StringBuilder word=new StringBuilder(s).reverse();
        return word.toString();

    }

    public static void main(String[] args) {
        HW1 word=new HW1();
        System.out.println(word.reverseString("Syntax"));
    }
}