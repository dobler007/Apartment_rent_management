package Vehicles;


public class Motorcycle extends Vehicle{

    public Motorcycle(int weight, String name, double volume) {
        super(weight, name, volume);
        this.accessibility = 0;
    }

    public Motorcycle(String name, double volume) {
        super(name, volume);
        this.accessibility = 0;
    }

}
