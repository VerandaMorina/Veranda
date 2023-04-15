package GroupProject;

public class Task10 {
    /*
    Write a program to print out duplicate elements from an Array of Strings?
     */
    public static void main(String[] args) {
        String names[] = {"Veranda", "Mozzi", "Vali", "Genti", "Mozzi"};

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate name in this array is: " + names[i]);
                }
            }
        }
    }
}
