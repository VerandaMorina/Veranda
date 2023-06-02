package class15;

import java.util.Arrays;

public class E1 {
    //Create a method that takes a number call it size.
    //in the method body create an array of that size
    //with size given by that number fill the array with some numbers lets say 10 with a for loop and return the array
    //call the method createArray
    //createArray()

     int []createArray(int size){
         int[]arr=new int[size];
         for (int i = 0; i <size; i++) {//we say execute array based on the size we put down
             arr[i]=10;//we are filling the array here
         }
         return arr;
    }

    public static void main(String[] args) {
        //Now we call this method
        E1 e1=new E1();
        int []array= e1.createArray(8);
        // to print the array
       // System.out.println(Arrays.toString(array));
        //other way is iter and it writes the first line of code we just add sout(i)
        /*for (int i : array) {
            System.out.println(i);

         */
        //the third way to print an array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        }
    }


