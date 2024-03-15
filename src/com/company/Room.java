package com.company;

public class Room {
    int price;
    int height; int width; int length;
    Person person;
    int volume;
    volatile boolean vacant;
    String name;

    public Room(int price, int height, int width, int length, Person person) {
        this.price = price;
        this.height = height;
        this.width = width;
        this.length = length;
        this.person = person;
        this.volume = height * length * width;
        this.vacant = true;
    }

    public Room(String name){
        this.name = name;
    }

    public Room(int price, int height, int width, int length) {
        this.price = price;
        this.height = height;
        this.width = width;
        this.length = length;
        this.volume = height * length * width;
        this.vacant = false;
    }



}
