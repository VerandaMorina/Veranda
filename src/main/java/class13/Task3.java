package class13;

public class Task3 {
    public static void main(String[] args) {
        String str="Is it Saturday. Is it raining? Do we have java today?";
        String [] strArr=str.split("[.?]");
        System.out.println(strArr.length);
    }
}
