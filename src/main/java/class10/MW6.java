package class10;

public class MW6 {
    /*
    Create 2D array of countries: north america countries, south america countries,
     europe countries, asian countries, african countries.
     Then print all values from that array using 2 different loops and calculate how many total countries been stored.
     */
    public static void main(String[] args) {

    String[][] countries = {
            {"United States", "Canada"},
            {"Brazil","Argentina", "Chili"},
            {"France", "UK", "Germany"},
            {"Japan", "China"},
            {"South Africa", "Angola"}
    };

        for (int i = 0; i < countries.length; i++) {
        for (int j = 0; j < countries[i].length; j++) {
            System.out.print(countries[i][j] + " ");
        }
        System.out.println();
    }

        System.out.println("");

    int a = 0;

        while (a < countries.length) {
        int b = 0;
        while (b < countries[a].length) {
            System.out.print(countries[a][b] + " ");
            b++;
        }
        a++;
        System.out.println();
    }

        System.out.println("");

    int sum = 0;
        for (int i = 0; i < countries.length; i++) {
        sum += countries[i].length;
    }
        System.out.println("The number of countries in the array is " + sum);
}
}

