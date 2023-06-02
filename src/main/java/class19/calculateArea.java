package class19;
//Create 1 class in which create a methods that will calculate the area of Method name must be called calculateArea
//Rectangle
//Square
public class calculateArea {
    static void  Area (double a, double b) {
        double rectangle=a*b;
        System.out.println("The area of rectangle is "+rectangle);
    }
    static void Area(int e,int f){
        int square=e*f;
        System.out.println("The area of square is " + square);
    }
}
class calculateAreaTester {
    public static void main(String[] args) {
        calculateArea.Area(10,10);
        calculateArea.Area(5,5);



    }
}