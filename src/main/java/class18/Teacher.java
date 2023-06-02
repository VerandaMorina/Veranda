package class18;

public class Teacher {
    String name;
    String department;
    int years;

    void teaching(){
        System.out.println("is teaching....");
    }
    void onBreak(){
        System.out.println("is currently on break....");
    }

    void explaining(){
        System.out.println("is explaining new topic....");
    }
    void writing(){
        System.out.println("is writing something on the white board");
    }

}
class MathTeacher extends Teacher{

}
class ChemistryTeacher extends Teacher{

}
class PianoTeacher extends Teacher{

}
class TeacherTester {
    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher();
        mathTeacher.name="Suna";
        System.out.println(mathTeacher.name);
        mathTeacher.onBreak();
        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.name="Jacob";
        System.out.println(chemistryTeacher.name);
        chemistryTeacher.explaining();
        PianoTeacher pianoTeacher=new PianoTeacher();
        pianoTeacher.name="Aron";
        System.out.println(pianoTeacher.name);
        pianoTeacher.teaching();
        Teacher teacher=new Teacher();
        teacher.name="Bred";
        System.out.println(teacher.name);
        teacher.writing();
    }
}
