abstract class Bikes {
    Bikes() {
        System.out.println("Bike is Creating");
    }

    abstract void run();

    void changeGear() {
        System.out.println("Gear Change ");
    }
}

    class Honda extends Bikes {
        void run() {
            System.out.println("Running safely");
        }
    }
        class TestAbstraction1 {
            public static void main(String[] args) {
                Bikes b = new Honda();
                b.run();
                b.changeGear();

            }
        }



