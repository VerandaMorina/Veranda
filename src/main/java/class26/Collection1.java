package class26;
import java.util.*;

public class Collection1 {
    public static void main(String[] args) {
        Collection<String> set=new LinkedList<>();
        set.add("Syntax");
        set.add("Technologies");
        set.add("are");
        set.add("the");
        set.add("best");
        for(String word:set){
            System.out.print(word+" ");
        }
    }
}
