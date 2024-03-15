package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Vehicles.CityCar;
import Vehicles.Motorcycle;
import Vehicles.Amphibious;
import Vehicles.Boat;
import Vehicles.OffRoadCar;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void menu() {
        System.out.println("1: Show your apartments" + "\n" +
                "2: buy an apartment" + "\n" +
                "3: eviction lottery" + "\n" +
                "4: evict a tenant" + "\n" +
                "5: check the balance" + "\n" +
                "6: get a tenant" + "\n" +
                "7: show all people" + "\n" +
                "8: get a tenant" + "\n" +
                "9: Parking space" + "\n" +
                "10: save to a data file" + "\n" +


                "0: Quit the application" + "\n");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Person> people = new ArrayList<>();
        ArrayList<Apartment> apartments = new ArrayList<>();

        people.add(new Person("Alice", 25, new CityCar(1200, "Toyota", 10.0)));
        people.add(new Person("Bob", 30, new CityCar(1100, "Ford", 9.0)));
        people.add(new Person("Charlie", 22, new CityCar(1300, "Chevrolet", 11.0)));
        people.add(new Person("David", 28, new CityCar(1000, "Honda", 8.0)));
        people.add(new Person("Eva", 35, new CityCar(1400, "Porsche911", 12.0)));
        people.add(new Person("Frank", 26, new CityCar(1250, "BMW", 10.5)));
        people.add(new Person("Grace", 32, new CityCar(1150, "Mercedes", 9.5)));
        people.add(new Person("Henry", 23, new CityCar(1350, "Lexus", 11.5)));
        people.add(new Person("Ivy", 29, new CityCar(1050, "Audi", 8.5)));
        people.add(new Person("Jack", 31, new CityCar(1100, "Tesla", 9.2)));
        people.add(new Person("Mir", 22, new Motorcycle(12, "bicycle", 2.2)));

        String[] names = {"John", "Emma", "Michael", "Sophia", "Daniel", "Olivia", "William", "Ava", "Benjamin", "Isabella"};
        String[] surnames = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor"};

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            String randomName = names[random.nextInt(names.length)];
            String randomSurname = surnames[random.nextInt(surnames.length)];
            int randomAge = 18 + random.nextInt(80);  // Ages between 18 and 80

            people.add(new Person(randomName + " " + randomSurname, randomAge, null));
        }

        //========================================
        Parking p1 = new Parking(15, 4, 150);
        ArrayList<Room> ap1Rooms = new ArrayList<>();
        ap1Rooms.add(new Room("Bedroom"));
        ap1Rooms.add(new Room("LivingRoom"));
        Apartment app1 = new Apartment(400, 1, p1, 2000, people.get(0), ap1Rooms);
        apartments.add(app1);

        Parking p2 = new Parking(20, 3, 180);
        ArrayList<Room> ap2Rooms = new ArrayList<>();
        ap2Rooms.add(new Room("Bedroom"));
        ap2Rooms.add(new Room("Kitchen"));
        ap2Rooms.add(new Room("LivingRoom"));
        Apartment app2 = new Apartment(500, 2, p2, 2000, ap2Rooms);
        apartments.add(app2);

        Parking p3 = new Parking(17, 2, 160);
        ArrayList<Room> ap3Rooms = new ArrayList<>();
        ap3Rooms.add(new Room("Bedroom"));
        ap3Rooms.add(new Room("Office"));
        Apartment app3 = new Apartment(450, 3, p3, 2200, ap3Rooms);
        apartments.add(app3);

        Parking p4 = new Parking(18, 3, 170);
        ArrayList<Room> ap4Rooms = new ArrayList<>();
        ap4Rooms.add(new Room("Bedroom"));
        ap4Rooms.add(new Room("Kitchen"));
        ap4Rooms.add(new Room("LivingRoom"));
        Apartment app4 = new Apartment(480, 4, p4, 2300, ap4Rooms);
        apartments.add(app4);

        Parking p5 = new Parking(19, 4, 180);
        ArrayList<Room> ap5Rooms = new ArrayList<>();
        ap5Rooms.add(new Room("Bedroom"));
        ap5Rooms.add(new Room("Office"));
        ap5Rooms.add(new Room("Gym"));
        Apartment app5 = new Apartment(520, 5, p5, 2600, ap5Rooms);
        apartments.add(app5);

        Parking p6 = new Parking(21, 3, 190);
        ArrayList<Room> ap6Rooms = new ArrayList<>();
        ap6Rooms.add(new Room("Bedroom"));
        ap6Rooms.add(new Room("LivingRoom"));
        Apartment app6 = new Apartment(580, 6, p6, 2800, ap6Rooms);
        apartments.add(app6);

        Parking p7 = new Parking(22, 2, 200);
        ArrayList<Room> ap7Rooms = new ArrayList<>();
        ap7Rooms.add(new Room("Bedroom"));
        ap7Rooms.add(new Room("Kitchen"));
        Apartment app7 = new Apartment(550, 7, p7, 2700, ap7Rooms);
        apartments.add(app7);

        Parking p8 = new Parking(24, 4, 210);
        ArrayList<Room> ap8Rooms = new ArrayList<>();
        ap8Rooms.add(new Room("Bedroom"));
        ap8Rooms.add(new Room("Office"));
        ap8Rooms.add(new Room("LivingRoom"));
        Apartment app8 = new Apartment(600, 8, p8, 3000, ap8Rooms);
        apartments.add(app8);

        Parking p9 = new Parking(20, 2, 180);
        ArrayList<Room> ap9Rooms = new ArrayList<>();
        ap9Rooms.add(new Room("Bedroom"));
        ap9Rooms.add(new Room("LivingRoom"));
        Apartment app9 = new Apartment(480, 9, p9, 2300, ap9Rooms);
        apartments.add(app9);

        Parking p10 = new Parking(23, 5, 220);
        ArrayList<Room> ap10Rooms = new ArrayList<>();
        ap10Rooms.add(new Room("Bedroom"));
        ap10Rooms.add(new Room("Kitchen"));
        ap10Rooms.add(new Room("Office"));
        Apartment app10 = new Apartment(650, 10, p10, 3200, ap10Rooms);
        apartments.add(app10);

        Parking p11 = new Parking(15, 4, 6);
        ArrayList<Room> ap11Rooms = new ArrayList<>();
        ap11Rooms.add(new Room("toilet x bedroom x kitchen"));
        Apartment app11 = new Apartment(8, 11, p11, 400, ap11Rooms);
        apartments.add(app11);
        //============================================

        //=========================
        CityCar Bugatti = new CityCar(1230, "Bugatti", 12.0);
        Person Dauirzhan = new Person("Dauirzhan", 21, Bugatti);
        people.add(Dauirzhan);
        //=========================

        Parking pp1 = new Parking(150, 4, 150);
        ArrayList<Room> ap1 = new ArrayList<>();
        Room bedroom = new Room("Bedroom");
        ap1.add(bedroom);
        Room gamingRoom = new Room("Gaming room");
        ap1.add(gamingRoom);
        Room officeRoom = new Room("Office");
        ap1.add(officeRoom);
        Room gymRoom = new Room("Gym");
        ap1.add(gymRoom);
        Room library = new Room("Library");
        ap1.add(library);
        Room kingRoom = new Room("King bedroom");
        ap1.add(kingRoom);
        Room LivingRoom = new Room("LivingRoom");
        ap1.add(LivingRoom);
        Room MirRoom = new Room("Room where Mir grows old");
        ap1.add(MirRoom);
        Room kitchen = new Room("Kithen");
        ap1.add(kitchen);
        Apartment appp1 = new Apartment(400, 1, p1, 20000, null, ap1);
        apartments.add(appp1);

        for (int i = 0; i < people.size(); i++) {
            int apartmentIndex = i % apartments.size();
            people.get(i).setApartment(apartments.get(apartmentIndex));
        }


        Thread apartmentThread = new Thread(app1);
        apartmentThread.start();


        int uniqueApartmentNum = 100;
        int myBalance = 1000000;
        int option;
        do {
            menu();
            option = scan.nextInt();
            switch (option) {
                case 1: {
                    for (int i = 0; i <= apartments.size() - 1; i++) {
                        System.out.print(i + " -> ");
                        System.out.println(apartments.get(i));
                    }
                    break;
                }
                case 2: {
                    Apartment tmp = new Apartment();
                    System.out.println("Whats the apartment's volume ?");
                    int volume = scan.nextInt();
                    tmp.volume = volume;
                    tmp.apartmentNum = uniqueApartmentNum;
                    uniqueApartmentNum++;
                    System.out.println("How many rooms does it have ?");
                    int roomsAmount = scan.nextInt();
                    for (int i = 0; i < roomsAmount; i++) {
                        System.out.println("what kind of room is it ?");
                        scan.nextLine();
                        String roomName = scan.nextLine();
                        Room tmpRoom = new Room(roomName);
                        tmp.rooms.add(tmpRoom);
                    }
                    System.out.println("Whats the rent price ?");
                    tmp.price = scan.nextInt();

                    System.out.println("Apartment has been officially bought. the Apartment number is: " + uniqueApartmentNum);
                    System.out.println(tmp);
                    apartments.add(tmp);
                    break;
                }
                case 3: {
                    int luckyTenant = (int) (Math.random() * apartments.size() - 1) + 0;
                    String bum = apartments.get(luckyTenant).renter.name;
                    apartments.get(luckyTenant).evict();
                    System.out.println(bum + " is made homeless!");
                    break;
                }
                case 4: {

                    for (int i = 0; i < apartments.size(); i++) {
                        if (apartments.get(i).vacant == true) {
                            System.out.println(i + ": " + apartments.get(i));
                        }
                    }

                    System.out.println("who will get evicted ?");
                    int apChoice = scan.nextInt();
                    apartments.get(apChoice).evict();
                    break;
                }
                case 5: {
                    System.out.println(myBalance);
                    break;
                }
                case 7: {
                    for (int i = 0; i < people.size(); i++) {
                        System.out.println(i + ": " + people.get(i));
                    }
                    System.out.println();
                    break;
                }
                case 8: {
                    for (int i = 0; i < apartments.size(); i++) {
                        if (apartments.get(i).vacant == false) {
                            System.out.println(i + ": " + apartments.get(i));
                        }
                    }
                    System.out.println("Which apartment will get a tenant ?");
                    int apChoice = scan.nextInt();

                    for (int i = 0; i < people.size(); i++) {
                        System.out.println(i + ": " + people.get(i));
                    }
                    System.out.println("who will get the apartment  ?");
                    int tenChoice = scan.nextInt();
                    apartments.get(apChoice).addPerson(people.get(tenChoice));

                    Thread newThread = new Thread(apartments.get(apChoice));
                    newThread.start();
                    break;
                }
                case 9: {
                    System.out.println("Select the parking space ");
                    for (int i = 0; i <= apartments.size() - 1; i++) {
                        System.out.println(i + ": " + apartments.get(i).parking);
                    }
                    int parkChoice = scan.nextInt();

                    System.out.println("Select an option: " + "\n" +
                            "1: store a thing " + "\n" +
                            "2: park a vehicle" + "\n" +
                            "3: remove a vehicle" + "\n" +
                            "4: remove a thing" + "\n"
                    );
                    int optionChoice = scan.nextInt();
                    switch (optionChoice) {
                        case 1: {
                            System.out.println("name of the thing you would like to store ?");
                            scan.nextLine();
                            String thing = scan.nextLine();
                            System.out.println("Whats the volume of the thing ?");
                            int thingVolume = scan.nextInt();
                            apartments.get(parkChoice).parking.storeThings(thing, thingVolume);
                            break;
                        }
                        case 2: {
                            System.out.println("Whats the name of the car ?(tesla, porche, F1 , yamaha etc");
                            scan.nextLine();
                            String carName = scan.nextLine();
                            System.out.println("Whats the volume of the vehicle ?");
                            int carVolume = scan.nextInt();
                            System.out.println("Where will it be parked ?");

                            for (int i = 0; i < apartments.size(); i++) {
                                if (apartments.get(i).parking.vehicle == null) {
                                    System.out.println(i + ": " + apartments.get(i).parking);
                                }
                            }
                            int giga = scan.nextInt();

                            System.out.println("What is the type of the car ?" + "\n" +
                                    "1: amphibious " + "\n" +
                                    "2: boat " + "\n" +
                                    "3: city car " + "\n" +
                                    "4: motorcycle " + "\n" +
                                    "5: off road car " + "\n"
                            );
                            int vehChoice = scan.nextInt();
                            switch (vehChoice) {
                                case 1:
                                    Amphibious amphibious = new Amphibious(carName, carVolume);
                                    apartments.get(giga).parking.parkVehicle(amphibious);
                                    break;
                                case 2:
                                    Boat boat = new Boat(carName, carVolume);
                                    apartments.get(giga).parking.parkVehicle(boat);

                                    break;
                                case 3:
                                    CityCar cityCar = new CityCar(carName, carVolume);
                                    apartments.get(giga).parking.parkVehicle(cityCar);

                                    break;
                                case 4:
                                    Motorcycle bike = new Motorcycle(carName, carVolume);
                                    apartments.get(giga).parking.parkVehicle(bike);

                                    break;

                                case 5:
                                    OffRoadCar offRoadCar = new OffRoadCar(carName, carVolume);
                                    apartments.get(giga).parking.parkVehicle(offRoadCar);

                                    break;
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Where from ?");

                            for (int i = 0; i < apartments.size(); i++) {
                                if (apartments.get(i).parking.vehicle != null) {
                                    System.out.println(i + ": " + apartments.get(i).parking);
                                }
                            }
                            int giga = scan.nextInt();
                            apartments.get(giga).parking.removeVehicle();
                            break;
                        }
                        case 4: {
                            System.out.println("Where from ?");

                            for (int i = 0; i < apartments.size(); i++) {
                                System.out.println(i + ": " + apartments.get(i).parking);
                            }
                            int giga = scan.nextInt();
                            System.out.println("What do you want removed ?");
                            for (int i = 0; i < apartments.get(giga).parking.things.size(); i++) {
                                System.out.println(i + ": " + apartments.get(giga).parking.things.get(i));
                            }
                            int giga2 = scan.nextInt();
                            apartments.get(giga).parking.things.remove(giga2);

                            break;
                        }
                    }
                    break;
                }
                case 10: {
                    try {
                        FileWriter writer = new FileWriter("file.txt");

                        for (Apartment apartment : apartments) {
                            writer.write(apartment.toString() + "\n");
                        }

                        writer.close();
                        System.out.println("Data saved to file.txt");
                    } catch (IOException e) {
                        e.printStackTrace();
                        System.out.println("Error saving data to a file");
                    }
                    break;
                }
            }
        } while (option != 0);

    }
}
