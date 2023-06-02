package class24;

import java.util.ArrayList;
import java.util.Iterator;

//removing the word that ends with letter "e" using iterator

public class E10ArrayList {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();
        names.add("Coke");
        names.add("Coffe");
        names.add("Water");
        names.add("Juice");

        names.removeIf(word->word.endsWith("e"));

        /*
        Iterator<String> iterator= names.iterator();

        while (iterator.hasNext()){
            String word= iterator.next();
            if (word.endsWith("e")){
                iterator.remove();
            }
        }

         */
        System.out.println(names);
    }
}
