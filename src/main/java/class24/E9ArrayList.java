package class24;

import java.util.ArrayList;

public class E9ArrayList {

    //remove word that ends with letter e
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Grocery");
        names.add("Ferrari");
        names.add("Porsche");
/*
        for(String word:words){
            if (word.endsWith("e")){
                words.remove(word);
            }
        }

 */
        //whenever we have to do something that changes the size of the arraylist we use fori loop
        for (int i = 0; i < names.size(); i++) {
            String word= names.get(i);
            if (word.endsWith("e")){
                names.remove(i);
                i--;
            }

        }
        System.out.println(names);


    }

}
