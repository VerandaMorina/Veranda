package class14;

import java.util.Scanner;

public class HW1 {
    void hello(String lang) {

        switch (lang) {
            case "English":
                System.out.println("Hello");
                break;
            case "Spanish":
                System.out.println("Hola");
                break;
            case "Albanian":
                System.out.println("Pershendetje");
                break;
            case "French":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Language Unknown");
        }

    }

    public static void main(String[] args) {
        HW1 lang1 = new HW1();

        lang1.hello("Albanian");
    }

}


