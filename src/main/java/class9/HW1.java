package class9;

public class HW1 {
    /*
    Create an array of chars and store grades into it: A,B,C,D.
    Then print a grade B (use 2 different ways of creating an array).
     */
    public static void main(String[] args) {
        char[] chars = {'A', 'B', 'C', 'D'};

        System.out.println(chars[1]);

        char[] chars1 = new char[4];
        chars1[0] = 'A';
        chars1[1] = 'B';
        chars1[2] = 'C';
        chars1[3] = 'D';


        System.out.println(chars1[1]);

    }
}
