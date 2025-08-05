package Day15;

class Vehicle{
    int noWheels;
    String mode;

    public void Start() {
        System.out.println("Start the Car");
    }

    public void Stop() {
        System.out.println("Stop the Car");
    }
}

class car extends Vehicle{
    int mileage;
    public void applyBrake() {
        System.out.println("Applying breaks");
    }
}

public class InheritanceSingle {
    public static void main(String[] args) {
        car c = new car();
        c.Start();
        c.mileage = 22;
        c.noWheels = 4;
        System.out.println(c.mileage);
        System.out.println("No. of wheels of a car is: "+c.noWheels);
        c.Stop();
    }
}