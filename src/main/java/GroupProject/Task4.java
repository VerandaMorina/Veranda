package GroupProject;

public class Task4 {
    /*
     Create a 2D array of integers. Develop a program
    which will calculate the sum of even and odd numbers
    for that array.
     */
    public static void main(String[] args) {
        int[][] arr2D = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        int sumEven=0;
        int sumOdd=0;
        for (int []arr1D:arr2D){
            for (int num:arr1D){
                if (num%2==0){
                    sumEven=sumEven+num;
                }
                if (num%2!=0){
                    sumOdd=sumOdd+num;
                }
            }
        }
        System.out.println("The sum of even numbers is: "+sumEven);
        System.out.println("The sum of odd numbers is: "+sumOdd);

    }
    }

