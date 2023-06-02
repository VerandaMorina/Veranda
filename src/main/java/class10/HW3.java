package class10;

public class HW3 {
    /*
    Using 2D array create a grocery list.
Inside you should have an array of veggies, fruits, dairy and sweets.
Retrieve all values from that array using 2 different loops
     */
    public static void main(String[] args) {
        String[][] fruits = {
                {"Banana", "Apple", "Cherry", "Orange"},
                {"Carrots", "Cucumber", "Pepper"},
                {"M&M", "Snickers", "Ice cream"},

        };
        for (int i = 0; i < fruits.length; i++) {
            for (int j = 0; j < fruits[i].length; j++) {
                System.out.print(fruits[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        int i = 0;

        while (i < fruits.length) {
            int j = 0;
            while (j < fruits[i].length) {
                System.out.print(fruits[i][j] + " ");
                j++;
            }
            i++;
            System.out.println();

        }
    }
}
