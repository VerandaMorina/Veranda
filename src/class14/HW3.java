package Class14;

public class HW3 {

 /*
    Write a method to return whether given number is prime or not?
  */

    boolean isPrime(int a) {
        int count = 0;
        boolean isprime = false;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                count++;
        }

        if (count == 2) {
            isprime = true;
        }

        return isprime;
    }

    public static void main(String[] args) {
        Class14.HW3 obj = new Class14.HW3();
        boolean answer = obj.isPrime(9);
        System.out.println(answer);

    }
}
