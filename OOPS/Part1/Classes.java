package OOPS.Part1;

class Car{
    public String color;
    public int weight;
    public int fuelCapacity;

    Car(){
        System.out.println("Creating Car: ");
    }

    Car(String color, int weight, int fuelCapacity){
        this.color = color;
        this.weight = weight;
        this.fuelCapacity = fuelCapacity;
    }

    Car(Car copy){
        this.color = copy.color;
        this.fuelCapacity = copy.fuelCapacity;
        this.weight = copy.weight;
    }

    public void startCar() {
        System.out.println("Starting Car");
    }

    public void stopCar() {
        System.out.println("Stopping Car");
    }
}

public class Classes {
    public static void main(String[] args) {
        Car c = new Car();
        c.color = "Red";
        c.fuelCapacity = 20;
        c.weight = 200;
        System.out.println(c.color);
        System.out.println(c.fuelCapacity);
        System.out.println(c.weight);
        System.out.println("New Car Details Below");
        Car c1 = new Car("White", 100, 10);
        System.out.println(c1.color);
        System.err.println(c1.weight);
        System.out.println(c1.fuelCapacity);
        c.startCar();
        c.stopCar();
        System.out.println("New Car Details Below");
        Car alto = new Car(c1);
        System.out.println(alto.color);
        System.out.println(alto.fuelCapacity);
        System.out.println(alto.weight);
    }
}