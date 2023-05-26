package class24;

import java.util.ArrayList;
import java.util.LinkedList;
//create an array from 1 to 500
//remove any number that is divisible by 5 from the array

public class E13ArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> numbers=new LinkedList<>();
        for (int i = 2; i < 500; i=i+2) {
            numbers.add(i);

        }
        System.out.println(numbers);
        numbers.removeIf(number->number%5==0);
        System.out.println(numbers);

    }
}
