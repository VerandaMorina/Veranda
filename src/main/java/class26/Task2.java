package class26;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Task2 {
    /*
    Create a map of countries with its capital that will store countries in alphabetical order.
    Print all keys and values from a country map using for each loop and iterator.
    Print all values from a country map using for each loop.
     */
    public static void main(String[] args) {
        TreeMap<String,String>country=new TreeMap<>();
        country.put("Kosovo","Prishtina");
        country.put("Albania","Tirana");
        country.put("United Kindom","London");
        country.put("France","Paris");
        country.put("Germany","Bayern");
        Set<Map.Entry<String,String>> entrySet=country.entrySet();
        for (Map.Entry<String,String>e:entrySet){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }


}
