package class28;



public class Task1 {
    /*
   Create a method to check age eligibility that
   will throw a runtime exception. Method should
   throw an exception age is less than 16.
   */
    public static void ageCheck(int age) throws RuntimeException{
        if (age<16){

            throw new RuntimeException ("Age is less than 16");
        }

    }
    public static void main(String[] args) {

        int age = 9;

        ageCheck(age);



    }
}
