package com.company;

import java.util.ArrayList;
import Vehicles.Vehicle;


public class Parking {
    int volume;
    ArrayList<String> things = new ArrayList<>();
    int stuffMax;
    int accessibility;
    Vehicle vehicle;


    public Parking(int volume, int accessibility, int stuffMax) {
        this.volume = volume;
        this.accessibility = accessibility;
        this.stuffMax = stuffMax;
    }


    public void storeThings(String thing, int volume){
        if(this.stuffMax - volume > 0){
            things.add(thing);
            stuffMax -= volume;
        } else System.out.println("Too much things. You can get rid of something to add a new thing. Would you like to ?");
    }

    public void parkVehicle(Vehicle vehicle){
        if(this.accessibility >= vehicle.getAccessibility() && this.volume >= vehicle.getVolume()) this.vehicle = vehicle;
        else System.out.println("This vehicle cant be parked here due to volume or acessibility");
    }
    public void removeVehicle(){
        String name = this.vehicle.getName();
        this.vehicle = null;
        System.out.println(name + " has been removed from the parking space!");

    }

    @Override
    public String toString() {
        return "{" +
                "volume=" + volume +
                ", things=" + things +
                ", stuffMax=" + stuffMax +
                ", accessibility=" + accessibility +
                ", vehicle=" + vehicle +
                '}';
    }
}
