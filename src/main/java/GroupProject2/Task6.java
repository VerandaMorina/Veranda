package GroupProject2;


public interface Task6 {

    double calculateArea(double a, double b);

    double calculatePerimiter(double a, double b);
}

class Circle implements Task6 {


    @Override
    public double calculateArea(double a, double b) {
        double area = (a * (b * 2));
        return area;
    }

    @Override
    public double calculatePerimiter(double a, double b) {
        double perimiter = 2 * a * b;
        return perimiter;
    }


}

class Square implements Task6 {


    @Override
    public double calculateArea(double a, double b) {
        double area = a * b;
        return area;
    }

    @Override
    public double calculatePerimiter(double a, double b) {
        double perimiter = a * b;
        return perimiter;
    }
}

class ShapeTester {
    public static void main(String[] args) {

        Circle cirlce = new Circle();
        System.out.println(cirlce.calculateArea(3.14, 5));
        System.out.println(cirlce.calculatePerimiter(3.14, 8));

        Square square = new Square();
        System.out.println(square.calculateArea(5, 5));
        System.out.println(square.calculatePerimiter(4, 5));


    }
}