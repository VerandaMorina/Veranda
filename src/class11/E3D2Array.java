package class11;

public class E3D2Array {
    //Enhanced for loop
    public static void main(String[] args) {
        String[][] names2DArray = {
                {"Sarah", "Artem", "Lean", "Semir"},
                {"Farwa", "Halima", "Alina", "Semir"}
        };
         for (String[]name1DArray:names2DArray){
             for (String name:name1DArray){
                 System.out.print(name+" ");
             }
         }


    }
}
