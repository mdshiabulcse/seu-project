
public abstract class Vehicle {
     double speed;
     double acceleration;
     double gear;
     double maxSpeed;

    public Vehicle(double speed, double acceleration, double gear, double maxSpeed) {
        this.speed = speed;
        this.acceleration = acceleration;
        this.gear = gear;
        this.maxSpeed = maxSpeed;
    }

    public abstract void start();

        return speed;
    }

     double Acceleration() {
        return acceleration;
    }

     double Gear() {
        return gear;
    }

     double MaxSpeed() {
        return maxSpeed;
    }


    public void displayInfo() {
        System.out.println("Speed: " + speed);
        System.out.println("Acceleration: " + acceleration);
        System.out.println("Gear: " + gear);
        System.out.println("Max Speed: " + maxSpeed);
    }
}


