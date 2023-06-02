package class26;

import java.util.HashSet;
import java.util.Set;

public class EntrySetTester {
    public static void main(String[] args) {
        Set<Entry> entrySet=new HashSet<>();
        entrySet.add(new Entry("Coke",2.0));
        entrySet.add(new Entry("Milk",5.0));
        entrySet.add(new Entry("Mango juice",2.5));
        entrySet.removeIf(x->x.getKey().contains("i")&& x.getPrice()>2);
        System.out.println(entrySet);
    }
}
