package Vehicles;
import com.company.Person;

public class Vehicle {
    int weight;
    String name;
    double volume;
    int accessibility;


    Vehicle(int weight, String name, double volume){
    this.weight = weight;
    this.name = name;
    this.volume = volume;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public Vehicle(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public Vehicle(String name, double volume, int accessibility) {
        this.name = name;
        this.volume = volume;
        this.accessibility = accessibility;
    }

    public int getAccessibility(){
        return accessibility;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return name;
    }
}
