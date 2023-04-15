package class10;

public class HW4 {
    /*
    Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
     Print the sum of all numbers.
     */
    public static void main(String[] args) {
        int [][] matrix={
                {10,20,30},
                {20,50,65},
                {102,54,60}
        };

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }

}
