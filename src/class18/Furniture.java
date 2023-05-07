package class18;

public class Furniture{

    String color="Black";
}

class Chair extends Furniture{
    String color="White";

    void printColor(){
        //String color="Blue";
        /*
        System.out.println(this.color);//calls white
        System.out.println(super.color);//super means parent that means from class Furtnitore color black
        */
        System.out.println(color);
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        // when we have multiple same color java preffers local varibles
        //this example void printColor is local
        Chair chair=new Chair();
        chair.printColor();
    }
}
