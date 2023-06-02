package class11;

public class E1D2Array {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        //print only odd numbers from this 2d array using loops

        //this first for loop is to get all elements
        //second for loop ==>arr[row] gives me the the array at specific index i
        //i from the first row is 0 so it takes the first line of numbers
        //then it takes 1,2,3 and so on
        //third one is modules that we use to print odd or even if we want even %2!=0

        for (int row = 0; row <arr.length; row++) {
            for (int col = 0; col <arr[row].length; col++) {
                if (arr[row][col]%2==1)
                    System.out.print(arr[row][col]+" ");

            }

        }
        }
    }

