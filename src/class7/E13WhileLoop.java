package class7;

public class E13WhileLoop {
    public static void main(String[] args) {
        //print odd numbers
        int num=100;

        while (num>=1){
            if (num%2==1)//odd numbers when divided by 2 gives 1 as remainder
                //even numbers gives 0 as a remainder thats why we say num%2==0
            //or you can do it like num%2!=0
                System.out.print(num+ " ");
            num--;
        }
    }
}
