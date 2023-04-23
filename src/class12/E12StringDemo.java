package class12;

public class E12StringDemo {
    public static void main(String[] args) {
        String sentence="Yup we have another class";
        System.out.println(sentence.substring(12));

        int startIndex=sentence.length()-4;
        System.out.println(sentence.substring(startIndex));
    }
}
