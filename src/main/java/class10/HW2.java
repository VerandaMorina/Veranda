package class10;

public class HW2 {
    /*
    Create 2D array of cars : american, german, korean, italian.
     Then retrieve all values from that array using 2 different loops
     */
    public static void main(String[] args) {
        String[][] cars = {
                {"Ferrari", "Toyota", "Golf", "Tesla"},
                {"BMW", "Audi", "Mercedes", "Volkswagen"},
                {"KIA", "Genesis", "Hyundai"},

        };
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int i = 0;

        while (i < cars.length) {
            int j=0;
            while (j < cars[i].length) {
                System.out.print(cars[i][j] + " ");
                j++;
            }
            i++;
            System.out.println();

        }
    }
}
