package org.example.barrier;

public class RunWay implements Barrier{

    private String name;
    private double distance;

    public RunWay(String name, double distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public String overcome() {
        return "подолала перешкоду "+"\""+ getName()+"\""+" на дистанції "+getDistance()+" м.";
    }

    @Override
    public String notOvercome() {
        return "не подолала перешкоду "+"\""+ getName()+"\""+" на дистанції "+getDistance()+" м.";
    }
}
