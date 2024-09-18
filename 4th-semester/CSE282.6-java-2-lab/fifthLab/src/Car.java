
public class Car extends Vehicle {
     double numDoors;

    public Car(double speed, double acceleration, double gear, double maxSpeed, int numDoors) {
        super(speed, acceleration, gear, maxSpeed);
        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        System.out.println("Starting the car...");
    }
}
