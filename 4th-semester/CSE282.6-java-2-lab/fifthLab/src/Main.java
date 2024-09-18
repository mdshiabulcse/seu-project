public class Main {
    public static void main(String[] args) {
        Car c = new Car(100, 9, 5, 200, 4);
        Bus b = new Bus(80, 7, 4, 120, 30);

        System.out.println("Car Information:");
        c.displayInfo();
        c.start();

        System.out.println();

        System.out.println("Bus Information:");
        b.displayInfo();
        b.start();
    }
}