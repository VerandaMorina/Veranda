package GroupProject2;

public class Task8 {
    /*
    Create a Class Car that would have the following fields: carPrice and
    color and method calculateSalePrice() which should be returning a
    price of the car.
    Create 2 sub classes: Sedan and Truck. The Truck class has a field

    as weight and has its own implementation of calculateSalePrice()
    method in which returned price is calculated as following: if
    weight>2000 then returned price car should include 10% discount,
    otherwise 20% discount.
    The Sedan class has field as length and also does it is own
    implementation of calculateSalePrice(): if length of sedan is >20 feet
    then returned car price should include 5% discount, otherwise 10%
    discount
     */
    int length;
    double discount;

    void calculateSalePrice(int length, double carPrice) {
        if (length > 20) {
            discount = carPrice - (carPrice * 0.05);
        } else if (length < 20) {
            discount = carPrice - (carPrice * 0.1);
        }
        carPrice = discount;
        System.out.println(carPrice);
    }

}

class Sedan extends Task8 {
    int weight;
    double discountedcarprice;


    void calculateSalePrice(int weight, double carPrice) {
        if (weight > 2000) {
            discountedcarprice = carPrice - (carPrice * 0.1);
        } else if (weight < 2000) {
            discountedcarprice = carPrice - (carPrice * 0.2);
        }
        carPrice = discountedcarprice;
        System.out.println(carPrice);
    }
}

abstract class Task8Tester {
    public static double carPrice;
    String color;

    abstract void calculateSalePrice(int weight, double carPrice);

    public static void main(String[] args) {
        Task8 obj = new Task8();
        obj.calculateSalePrice(53, 3500.0);

        Task8 obj1=new Task8();
        obj1.calculateSalePrice(3300, 10000);
    }
}

