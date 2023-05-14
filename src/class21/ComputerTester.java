package class21;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] arr = {
                new Apple("Apple", "Blue", 25),
                new Lenovo("Lenovo", "Black", 15),
                new HP("HP", "White", 30),
                new Dell("Dell", "Black", 20)};
        for (Computer computer : arr) {
            computer.setPerformance();
            computer.update();

        }
        Computer del = new Dell("Dell", "Red", 303);
        ((Dell) del).restart();

        Computer hp = new HP("HP", "White", 200);
        ((HP) hp).shutDown();

    }
}