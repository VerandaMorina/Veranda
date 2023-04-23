package class13;

public class Math {
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void multi(int num1,int num2){
        System.out.println(num1*num2);
    }
    void divide(int num1,int num2){
        System.out.println(num1/num2);
    }
    void sub(int num1,int num2){
        System.out.println(num1-num2);
    }

    public static void main(String[] args) {
        Math math=new Math();
        math.add(3,7);
        math.multi(4,7);
        math.divide(9,3);
        math.sub(20,5);
    }
}
