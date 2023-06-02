package class3;

public class E14TypeCasting {
    public static void main(String[] args) {

        //we can force to store into a smaller box but we will get error we lose data
        short num=1200;
        byte num2=(byte)num;
        System.out.println(num2);
    }
}
