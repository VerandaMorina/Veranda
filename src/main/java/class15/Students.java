package class15;

public class Students {
    /*
    Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
     */
    String Name;
    String ID;

    static int numberOfStudent;


    public static void main(String[] args) {
        Students Student1 = new Students();
        Student1.Name = "Veranda";
        Student1.ID = "12345";
        numberOfStudent++;

        Students Student2 = new Students();
        Student2.Name = "Gramoz";
        Student2.ID = "56778";
        numberOfStudent++;

        System.out.println("Total number of students are: "+numberOfStudent);


    }
}
