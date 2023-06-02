package class26;

import java.util.LinkedHashMap;

public class Task1 {
    public static void main(String[] args) {
        /*
        Create a map of a building. Store floor number and its associated company name.
        (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate keys and values.
        Check how many entries you have?
        Update company on a 4th floor
        Remove company on the 7th floor
        Print your map
         */

        LinkedHashMap<String, Integer> company = new LinkedHashMap<>();
        company.put("Google", 1);
        company.put("Syntax", 2);
        company.put("BMW", 3);
        company.put("IBM", 4);
        company.put("Best Buy", 5);
        company.put("Walmart", 6);
        company.put("Apple", 7);

        System.out.println(company.size());
        company.replace("BMW", 3, 4);
        company.remove("Apple");
        System.out.println(company);
    }
}
