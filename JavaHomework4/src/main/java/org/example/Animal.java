package org.example;

public class Animal {

    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public Animal() {}

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public boolean getVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setVegetarian(Boolean vegetarian) {
        if (vegetarian!=null) {
            this.vegetarian = vegetarian;
        } else {
            this.vegetarian = false;
        }
    }

    public void setEats(String eats) {
        if (eats != null && !eats.isBlank()){
            this.eats = eats;
        } else {
            this.eats = "unknown";
        }
    }

    public void setNoOfLegs(Integer noOfLegs) {
        if (noOfLegs!=null){
            this.noOfLegs = noOfLegs;
        } else {
            this.noOfLegs = 0;
        }
    }

    @Override
    public String toString() {
        return "vegetarian=" + vegetarian +
                ", eats='" + eats + '\'' +
                ", noOfLegs=" + noOfLegs;
    }
}
