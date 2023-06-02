package GroupProject;

public class Task6 {
    /*
    Write a java program to check whether a given number is prime or not?
     */
    public static void main(String[] args) {
        int num=19;
        boolean isPrime=true;
        for (int i = 2; i <=num/2 ; i++) {
            System.out.println(i);
            if (num%i==0){
              isPrime=false;
              break;
            }

        }
        if (isPrime){
            System.out.println(num+" is prime");
        }else {
            System.out.println(num+ " is not prime");
        }
    }
}
