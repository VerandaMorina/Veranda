package class12;

import java.util.concurrent.Callable;

public class CarTester {
    public static void main(String[] args) {
       Car actualCar=new Car();

       actualCar.color="Dark Green";
       actualCar.isAutomatic=true;
       actualCar.mileage=0;
       actualCar.model="BMWi7";
       actualCar.make="BMW";


       actualCar.startCar();
       actualCar.stopCar();

       Car secondCar=new Car();
       secondCar.make="Tesla";
       secondCar.model="Tesla s";
       secondCar.mileage=0;
       secondCar.isAutomatic=true;
       secondCar.color="black";

       secondCar.startCar();
       secondCar.singal();
       secondCar.stopCar();
    }
}
