package class23;
//we can have multiple interfaces
public abstract interface MoveAble {
    int age=12;
    void move();
}
interface WashAble{
    void wash();
}
class Dog implements MoveAble,WashAble{

public void move(){
    System.out.println("Dogs can also move");
}

    @Override
    public void wash() {
        System.out.println("You can wash them");
    }
}
//how interfaces achive abstraction
class Cat implements MoveAble{
    @Override
    public void move(){
        System.out.println("Cats can also move");
    }
}
class Horse implements MoveAble{
    public void move(){
        System.out.println("Horses can also move");
    }
}