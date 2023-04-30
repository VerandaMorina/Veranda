package class15;

public class SyntaxEmployee {
    String empID;
    int salary;
    static String CEO="Sumair"; //when a variable doesnt change we use static



    public static void main(String[] args) {
        SyntaxEmployee Veranda = new SyntaxEmployee();

        Veranda.empID="12334";
        Veranda.salary=20000;
        System.out.println(SyntaxEmployee.CEO);

        SyntaxEmployee Mozzi=new SyntaxEmployee();
        Mozzi.empID="223444";
        Mozzi.salary=40000;
        System.out.println(SyntaxEmployee.CEO);
        System.out.println(Mozzi.empID);
        System.out.println(Veranda.empID);

    }
}


