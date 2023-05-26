package class24;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {

        int num=10;
        int num1=20;
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(num);
        numbers.add(num1);
        //datatype is being coverted automatically from Integer to int(auto unboxing)
       int number3 = numbers.get(0);
    }
}
