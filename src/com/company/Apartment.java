package com.company;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
public class Apartment implements Runnable{

    int volume;
    int apartmentNum;
    volatile boolean vacant = false;
    Parking parking;
    int price;
    Person renter;
    ArrayList<Room> rooms = new ArrayList<>();



    public Apartment(int volume, int apartmentNum, Parking parking, int price, Person renter, ArrayList<Room> rooms) {
        this.volume = volume;
        this.apartmentNum = apartmentNum;
        this.vacant = true;
        this.parking = parking;
        this.price = price;
        this.renter = renter;
        this.rooms = rooms;

    }
    public Apartment(int volume, int apartmentNum, Parking parking, int price, ArrayList<Room> rooms) {
        this.volume = volume;
        this.apartmentNum = apartmentNum;
        this.vacant = false;
        this.parking = parking;
        this.price = price;
        this.rooms = rooms;
    }

    public Apartment() {
    }

    public void addPerson(Person person) {
        if (!this.vacant) {
            person.setApartment(this);
            this.renter = person;
            this.vacant = true;
        } else {
            System.out.println("Apartment is already occupied.");
        }
    }

    public Apartment(int volume, int apartmentNum, int price, ArrayList<Room> rooms) {
        this.volume = volume;
        this.apartmentNum = apartmentNum;
        this.price = price;
        this.rooms = rooms;
    }

    public void evict(){
        this.renter = null;
        this.vacant = false;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "volume=" + volume +
                ", apartmentNum=" + apartmentNum +
                ", vacant=" + vacant +
                ", price=" + price +
                ", renter=" + renter +
                ", parking= " + parking +
                '}';
    }



    @Override
    public void run() {
        while (vacant) {
            try {
                System.out.println("Apartment " + apartmentNum + " is vacant. Waiting for a tenant to pay...");
                TimeUnit.SECONDS.sleep(30);
                System.out.println("Received rent payment for Apartment " + apartmentNum + ": $" + price);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
