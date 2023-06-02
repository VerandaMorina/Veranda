package class9;

public class HW8 {
    /*
    Create an array to store char values and then print those in reverse order
     */
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}
