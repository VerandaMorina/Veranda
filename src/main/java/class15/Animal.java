package class15;

class Animal {
    public void eat()
    {
        System.out.println("Cat eats");

    }
    public void sleep()
    {
        System.out.println("Cat sleeps a lot");

    }
    static class Cat extends Animal{
        @Override
        public void sleep()
        {
            System.out.println("Cat sleeps a lot");

        }

    }


    static class kitten1 extends Cat {
        @Override
        public void eat() {
            System.out.println("kitten1 eats milk");
        }

        @Override
        public void sleep() {
            System.out.println("kitten1 sleeps a lot");
        }

        static class kitten2 extends Cat {
            @Override
            public void eat() {
                System.out.println("kitten2 eats snacks");
            }

            @Override
            public void sleep() {

                System.out.println("kitten2 sleeps a lot");
            }
            static class kitten3 extends Cat{
                @Override
                public void eat() {

                    System.out.println("kitten3 eats everything");
                }

                @Override
                public void sleep() {
                    System.out.println("kitten3 sleeps a lot");
                }
            }
            public static void main(String[] args) {
                Animal a = new Animal();
                kitten1 b = new kitten1();
                kitten2 c = new kitten2();
                kitten3 d = new kitten3();
                a.eat();
                a.sleep();
                b.eat();
                b.sleep();
                c.eat();
                c.sleep();
            }
        }
    }
}
