package class24;

import java.util.ArrayList;

public class E8ArrayList {
    public static void main(String[] args) {

        ArrayList<String>names=new ArrayList<>();
        names.add("Vera");
        names.add("Mozi");
        names.add("Genti");
        names.add("Milja");
        names.add("Ludja");

        System.out.println(names.isEmpty());
        System.out.println(names.contains("Vera"));
        System.out.println(names.size());
        System.out.println(names);

    }
}
