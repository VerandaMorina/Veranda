package class16;

public class Person {
    private String password;
    static double bankBalance=12000;
    String SSN="1234566";//default accees

    private void printPaswword(){
        System.out.println(password);
    }
    private static void printBalance(){
        System.out.println(bankBalance);
    }
    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";
        farwa.printPaswword();
        System.out.println(Person.bankBalance);
        System.out.println(farwa.SSN);//default
    }
}
