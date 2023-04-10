package class9;

public class HW2 {

    /*
    Create an array of names and store all names of your group.
    Then print your name from that array. (use 2 different ways of creating an array)
     */
    public static void main(String[] args) {

        String[] names = {"Ana", "Abdul", "Moncef", "Justin", "Egor", "Vera"};
        System.out.println(names[5]);

        String[] names1 = new String[6];
        names1[0] = "Ana";
        names1[1] = "Abdul";
        names1[2] = "Moncef";
        names1[3] = "Justin";
        names1[4] = "Egor";
        names1[5] = "Vera";
        System.out.println(names1[5]);
    }
}
