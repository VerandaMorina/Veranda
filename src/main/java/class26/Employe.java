package class26;

import java.util.HashMap;
import java.util.Map;

public class Employe {
    /*
    Create a Map that will store Employee name and salary.
    Write a logic to retrieve an employee who gets the highest salary.
    Output should be in the below format
    John Smith=$100000
     */
    public static void main(String[] args) {
        HashMap<String,Double>map=new HashMap<>();
        map.put("Gramoz Berisha",349.3);
        map.put("Valmira Morina",200.5);
        map.put("Gentrit Lahu",4999.2);


        String name="";
        double salary=0;
        for(Map.Entry<String,Double>entry: map.entrySet()){
            String key= entry.getKey();
            double value= entry.getValue();
            if(value>salary){
                salary=value;
                name=key;
            }
        }
        System.out.println(name+"=$"+salary);
    }

}

