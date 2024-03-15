package com.company;
import Vehicles.Vehicle;


public class Person {
    String name;
    int age;
    Vehicle vehicle;
    Apartment apartment;

    public Person(String name, int age, Vehicle vehicle) {
        this.name = name;
        this.age = age;
        this.vehicle = vehicle;
    }

    public Person() {
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
    @Override
    public String toString() {
        return   name + ":" +
                " age=" + age +
                ", vehicle=" + vehicle;
    }

}
