package class21;

public class Computer {
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of the methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
    String name;
    String color;
    int performance;

    public Computer(String name, String color, int performance) {
        this.name = name;
        this.color = color;
        this.performance = performance;
    }

    void setPerformance() {
        System.out.println("Low performance");
    }

    void update() {
        System.out.println("Update requiered");
    }
}

class Apple extends Computer {
    public Apple(String name, String color, int performance) {
        super(name, color, performance);
    }

    @Override
    void setPerformance() {
        System.out.println("Apple is runing in a great performance");
    }
}

class Lenovo extends Computer {
    public Lenovo(String name, String color, int performance) {
        super(name, color, performance);
    }

    @Override
    void update() {
        System.out.println("Lenovo already up to date");
    }
}

class HP extends Computer {
    public HP(String name, String color, int performance) {
        super(name, color, performance);
    }

    void shutDown() {
        System.out.println("Hp shuting dowm");
    }
}

class Dell extends Computer {
    public Dell(String name, String color, int performance) {
        super(name, color, performance);
    }

    void restart() {
        System.out.println("Dell restarting");
    }
}