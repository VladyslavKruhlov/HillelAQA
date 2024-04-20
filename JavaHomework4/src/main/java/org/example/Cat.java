package org.example;

public class Cat extends Animal{

    private String color;

    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "unknown";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank()){
            this.color = color;
        } else {
            this.color = "unknown";
        }
    }

    @Override
    public String toString() {
        return "vegetarian=" + getVegetarian() +
                ", eats='" + getEats() + '\'' +
                ", noOfLegs=" + getNoOfLegs()+ '\''+
                ", color='" + color+"'";
    }
}
