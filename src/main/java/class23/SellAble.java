package class23;

public interface SellAble {
   // private int PRICE=1200;private access not allowed
   // protected int PRICE=1200; not allowed

    int PRICE = 12000;

  // final abstract void sell(); final not allowed as methods are abstract by default
   // static void sell; not allowed as static method cant be overriden

    void sell();
}
