package Vehicles;

import com.company.Person;

public class OffRoadCar extends Vehicle{

    public OffRoadCar(int weight, String name, double volume) {
        super(weight, name, volume);
        this.accessibility = 2;
    }

    public OffRoadCar(String name, double volume) {
        super(name, volume);
        this.accessibility = 2;
    }
}
