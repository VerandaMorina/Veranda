package class5;

public class home {
    public static void main(String[] args) {

     boolean a=true;
        boolean b=true;
        boolean c=true;

        if (!a || (b && c)){
            System.out.println("if executed");
        }else {
            System.out.println("else executed");
        }
    }
}
