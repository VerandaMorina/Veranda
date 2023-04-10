package class8;

public class HomeWork {
    public static void main(String[] args) {

        for (int i = 1; i < 50; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}