package class26;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PersonTester {
    /*
    In Test Class create a Map that will store key in ascending order.
    In that map store personId and a Person Object. Print each object details.
     */
    public static void main(String[] args) {

            Map<Integer, Person> map = new LinkedHashMap<>();
            Person person1 = new Person("Gramoz","Berisha",31,2200.5);
            Person person2 = new Person("Valmira","Morina",26,4544.5);


            map.put(1,person1);
            map.put(2,person2);



            for(Map.Entry<Integer,Person>entry:map.entrySet()){
                int key = entry.getKey();
                Person value= entry.getValue();
                System.out.println(key+" "+value);
            }
        }
    }
