package org.example;

public class Main {
    public static void main(String[] args) {

        Animal bear = new Animal();
        bear.setVegetarian(false);
        bear.setEats("meat");
        bear.setNoOfLegs(4);

        Animal shark = new Animal(false, "fish", 0);

        Cat cat = new Cat(false, "meat, fish", 4, "grey");

        Cat siam = new Cat(false, "meat", 4);

        Cat murk = new Cat(false, "All food", 4, "black");


        System.out.println("Animals: \n"+bear+"\n"+shark+"\n"+cat+"\n"+siam+"\n"+murk);
    }
}