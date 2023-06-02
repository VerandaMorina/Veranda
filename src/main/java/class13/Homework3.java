package class13;

public class Homework3 {
    /*
    How would you swap  2 strings without a temporary variable?
     */

        public static void main(String args[]) {
            String a = "Veranda";
            String b = "Morina";
            System.out.println("Before swap: " + a + " " + b);
            a = a + b;
            b = a.substring(0, a.length() - b.length());
            a = a.substring(b.length());
            System.out.println("After : " + a + " " + b);
        }
    }

