import com.sun.tools.javac.Main;

class Main1 extends ParentClass {
    public static void main(String[] args) {
        Main1 main2=new Main1();
        main2.m1();
        main2.m1("m1 method with parameter");
    }



}
    abstract class ParentClass {
        void m1() {
            System.out.println("m1 without parameters");
        }

        void m1(String word) {
            System.out.println(word);
        }

    }
