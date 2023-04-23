package class13;

public class Task2 {
    public static void main(String[] args) {
        String str="hdjhhhdWDUWHDUH12344!@#$%%";
        String str1=str.replaceAll("[^a-zA-Z]","");
        System.out.println(str1);
        System.out.println(str1.length());
    }
}
