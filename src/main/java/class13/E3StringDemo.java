package class13;

public class E3StringDemo {
    public static void main(String[] args) {
        String str="kskdkdjajGGYDGDYDGYGD12344@#$%%^";

        System.out.println(str.replaceAll("[^a-z]",""));
        //dont replace lower case letters from a-z and numbers from 0-9
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        //replace specific characters
        System.out.println(str.replaceAll("[Dk3]",""));
    }
}
