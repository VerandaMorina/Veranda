package class4;

public class E12NestedIf {
    public static void main(String[] args) {

        //if we put one if condition inside another if condition is called nested if

        System.out.println("3");//the are not inside if so they execute the are independent

        if (true) {//if its true the door is open
            System.out.println("1");
            if (false) {
                System.out.println("2");
            }
        }
        System.out.println("66");//the are not inside if so they execute the are independent
    }
}
