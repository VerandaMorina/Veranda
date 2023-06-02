package class9;

public class HW7 {
    /*
    From an array of integer elements find the largest number.
     */
    public static void main(String args[]) {

        int numbers[] = {12, 13, 45, 10, 34, 78};

        int largest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }

        }

        System.out.print(largest);
    }
}
