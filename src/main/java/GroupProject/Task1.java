package GroupProject;

public class Task1 {
    /*
    Create a program that uses an array to store a list of
    temperatures for a week, and then uses a loop to find
    the highest and lowest temperature for the week.
     */
    public static void main(String args[]) {

        int weekTemp[] = new int[]{5, 10, 15, 22, 25, 30, 33};

        int low = weekTemp[0];
        int high = weekTemp[0];

        for (int i = 1; i < weekTemp.length; ++i) {
            if (weekTemp[i] > high)
                high = weekTemp[i];

            if (weekTemp[i] < low)
                low = weekTemp[i];
        }

        System.out.print("Lowest temperature of the week is: "+low);
        System.out.println();
        System.out.print("Highest temperature of the week is: "+high);
    }
}


