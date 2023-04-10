package class7;

public class E14WhileLoop {

    public static void main(String[] args) {
        //from 1 to 10 add numbers 1+0=1 1+1=2 2+2=4 3+3=6 6+4=10 10+5=15 15+6=21 21+7=28 28+8=36 36+9=45 45+10=55
        int counter=1;
        int sum=0;
        while (counter<=10){
            sum+=counter;//sum=sum+counter
            counter++;

        }
        System.out.println(sum);
    }
}
