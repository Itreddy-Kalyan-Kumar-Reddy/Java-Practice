package Day18;

abstract class Vehicle{
    public void start(){// If we are using non-abstract method we need to give body
        System.out.println("Started");
    }
    
    abstract public void getNoOfWheels();// If we are using abstract method we need not to give body
}

class Car extends Vehicle {
    public void getNoOfWheels(){
        System.out.println("There are 4 Wheels for car");
    }
}

public class Abstract {
    public static void main(String[] args) {
        // Vehicle v = new Vehicle();
        Car c = new Car();
        c.getNoOfWheels();
    }
}
