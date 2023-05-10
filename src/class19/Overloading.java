package class19;

public class Overloading {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private void addNumbers(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    private void addNumbers(int num1, float num2) {
        System.out.println(num1 + num2);
    }

    private void addNumbers(double num1, double num2) {
        System.out.println(num1 + num2);
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        obj.addNumbers(10, 20);
        obj.addNumbers(10, 5.6);
        obj.addNumbers(10.6, 4.6);
    }
}

