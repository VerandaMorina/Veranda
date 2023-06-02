package class12;

public class Car {

    String model;
    String make;
    String color;
    int mileage;
    boolean isAutomatic;


    void startCar() {
        System.out.println("Starting the "+model+" car.....");
    }
        void stopCar(){
            System.out.println("Applying the breakes to stop the "+model);
        }
    void singal(){
        System.out.println("Changing lanes....");
    }
}
