package org.example.barrier;

public class Wall implements Barrier{

    private String name;
    private double height;

    public Wall(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    @Override
    public String overcome() {
        return  "подолала перешкоду "+"\""+ getName()+"\""+" висотою "+getHeight()+" м.";
    }

    @Override
    public String notOvercome() {
        return  "не подолала перешкоду "+"\""+ getName()+"\""+" висотою "+getHeight()+" м.";
    }
}
