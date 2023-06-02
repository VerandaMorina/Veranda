package class21;

public class Refresher {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        for (int num : arr) {
            System.out.println(num);
        }
        String[] names = {"Vlad", "Marina", "Veronica"};
        for (String name : names) {
            System.out.println(name.length());
        }
        Dog dog1=new Dog("Lal","Blue","Persian");
        Dog []dogs={dog1,new Dog("papi","white","chinesse")};

        for (Dog dog:dogs){
            dog.printInfo();
        }
    }
}
