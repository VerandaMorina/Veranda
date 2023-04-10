package class9;

public class HW5 {
    /*
    Create an array of animals and store 5 elements into it.
    Using 2 different loops print all elements from the array.
     */
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Tiger", "Lion", "Horse"};
        for (String animal : animals) {
            System.out.print(animal + " ");
        }
        System.out.println();
        String[] animals1 = {"Dog", "Cat", "Tiger", "Lion", "Horse"};
        for (int i = 0; i < animals1.length; i++) {
            System.out.print(animals1[i] + " ");
        }

    }
}
