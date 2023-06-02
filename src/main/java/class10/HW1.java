package class10;

public class HW1 {
    /*
     Create a 2D array(shorter way) in which first array will consist of 4 names and second array will contain grades.
     Then your program should print name of the students that has A and B grade
     */
    public static void main(String[] args) {
        String [][] students={
                {"Veranda","Gramoz","Valmire","Gentrit"},
                {"A","A","B","B"},

        };
        for (int i = 0; i < students[1].length; i++) {
            if (students[1][i].equals("A") || students[1][i].equals("B")) {
                System.out.println(students[0][i] + ": " + students[1][i]);
            }
        }
    }

}
