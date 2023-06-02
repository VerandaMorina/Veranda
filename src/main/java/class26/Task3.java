package class26;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task3 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop.
     */
    public static void main(String[] args) {
        Map<String,Integer>BestBuy=new LinkedHashMap<>();
        BestBuy.put("Printer",783455);
        BestBuy.put("Tv",12345);
        BestBuy.put("Pc",33444);
        BestBuy.put("HMDI",332222);
        //Set<Map.Entry<String,String>> and var is same
        var entrySet=BestBuy.entrySet();
        for (var e:entrySet){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }


}
