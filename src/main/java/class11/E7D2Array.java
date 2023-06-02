package class11;

public class E7D2Array {
    public static void main(String[] args) {
        //with loop count how many times we have true
        //Enhanced for loop
        boolean[][] arr2D = {
                {true, false, true, true, false},
                {true, false, false, false, false}

        };
        int counter = 0;
        for (boolean[] arr1D : arr2D) {
            for (boolean bool : arr1D) {
                if (bool) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}

