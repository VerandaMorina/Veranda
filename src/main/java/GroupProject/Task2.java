package GroupProject;

public class Task2 {
    /*
    Create an array of integer values. After the array is
    created, calculate the sum of all stored elements in
    that array.
     */
    public static void main(String[] args) {
        int values[]={20,24,50,12};
        int sum=0;

        for (int i : values) {
            sum += i;
        }
            System.out.println(sum);
        }
    }

