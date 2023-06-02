package class23;

public class MoveAbleTester {
    public static void main(String[] args) {
        MoveAble moveAble=new Horse();
        MoveAble []moveAbles={new Cat(),new Dog(),new Horse()};
        for (MoveAble m:moveAbles){
            m.move();
        }
    }
}
