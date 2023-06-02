package class26;

import java.util.Collection;
import java.util.LinkedList;

public class Collection2 {
    /*
    Create a collection of integers in which you can keep duplicates.
    Write a logic to find sum of all integers
     */
    public static void main(String[] args) {
        Collection<Integer> number=new LinkedList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);


        int sum=0;
        for(Integer num:number){
            sum+=num;
        }
        System.out.println(sum);
    }
}
