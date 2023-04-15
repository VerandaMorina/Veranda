package GroupProject;

import java.util.Arrays;

public class Task9 {
    /*
    Write a java program to find the second largest number in the array?
     */
    public static void main(String[] args) {
        int num[] = {3, 2, 7, 5, 9, 13, 20, 35};
        Arrays.sort(num);
        System.out.print("Second largest number in the array is " + num[num.length - 2]);
    }
}
