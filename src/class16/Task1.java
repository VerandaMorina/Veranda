package class16;

import class15.E1;

public class Task1 {
 //create a method that will acceptand aarray as parameters and will return a sum of all elements from that array.
    //method should be visible only within same package

    int sumArray(int []arr){
        int sum=0;
        for (int num:arr){
            sum=sum+num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        int result=task1.sumArray(new int[]{10,10,10});
        System.out.println(result);
    }
}
