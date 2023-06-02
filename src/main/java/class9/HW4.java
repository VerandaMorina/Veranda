package class9;

public class HW4 {
    /*
    Create an array of cars and store 6 elements into it.
     Using 2 different loops print all values from the array.
     */
    public static void main(String[] args) {
        String[] cars = {"BMW", "Mercedes", "Mustang", "Toyota", "Ford", "Ferrari"};
        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i] + " ");
        }
        System.out.println();

        String[] cars1 = {"BMW", "Mercedes", "Mustang", "Toyota", "Ford", "Ferrari"};
        for (String car : cars1) {
            System.out.print(car + " ");
        }
    }
}
