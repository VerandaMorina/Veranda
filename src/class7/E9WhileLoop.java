package class7;

public class E9WhileLoop {
    public static void main(String[] args) {

        //print 25 20 10 5
        //skip 15 by using not true ! operator
        int num=25;


        while(num>=5){
            if (num!=10) {
                System.out.print(num + " ");
            }
            num-=5;

        }
    }
}
