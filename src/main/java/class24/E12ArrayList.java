package class24;

import java.util.ArrayList;

public class E12ArrayList {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("RedBull");
        names.add("Coca cola");
        names.add("Fanta");

        for (int i = 0; i < names.size(); i++) {
            String word = names.get(i);
            if (word.contains("e")||word.contains("a")){
                names.set(i,"Water");
            }

        }
        System.out.println(names);

    }
}
