package Vehicles;


public class CityCar extends Vehicle{


    public CityCar(int weight, String name, double volume) {
        super(weight, name, volume);
        this.accessibility = 1;
    }
    public CityCar( String name, double volume) {
        super( name, volume);
        this.accessibility = 1;
    }
}
