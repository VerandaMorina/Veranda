package class18;

public class E1MultipleConstructor {
    public static void main(String[] args) {
        String str=new String("Java");
        char []chars={'J','a','v','a'};
        String str1=new String(chars);
        //extract java and convert it to upper case
        char []chars2={'t','h','e','J','a','v','a'};
        //this offset ignores first 3 char and count 4 takes 4 char
        String str3=new String(chars2,3,4);
        System.out.println(str.toUpperCase());
    }

}
