package OOPS.Part2;

class Vehicle {
    int noOfWheels;
    String Color;
    public void start() {
        System.out.println("Start");
    }
    public void stop() {
        System.out.println("Stop");
    }
}

class Car extends Vehicle{
    int milage;
    public void applyBrake(){
        System.out.println("Apply Brakes");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.start();
        c1.Color = "Red";
        System.out.println("Car1 color is: "+ c1.Color);
        c1.milage = 12;
        System.out.println("Car1 milage is: "+ c1.milage);
        c1.noOfWheels = 4;
        System.out.println("Car1 have no of wheels: "+ c1.noOfWheels);
        c1.applyBrake();
        c1.stop();
    }
}