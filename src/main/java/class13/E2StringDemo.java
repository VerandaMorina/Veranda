package class13;

public class E2StringDemo {
    public static void main(String[] args) {
        String str="njwndnwn2832eHJDHJ!@#$";
        System.out.println(str.replaceAll("[a-z]","*"));
        System.out.println(str.replaceAll("[A-Z]","#"));
        System.out.println(str.replaceAll("[0-9]","%"));
        System.out.println(str.replaceAll("[a-z0-9]","%"));


    }
}
