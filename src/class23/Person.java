package class23;


//interface extends another interface
//class extends another class
//class implements an interface


public interface Person {
    void eat();
}
interface Employee extends Person{
    void work();
}
class Tester implements Employee{
  @Override
    public void eat(){
      System.out.println("Testers dont eat");
  }
  @Override
    public void work(){
      System.out.println("Testers make developers work harder");
  }
}
