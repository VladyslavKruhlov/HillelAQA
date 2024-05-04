package org.example.entity;

public class Robot extends Participant{
    private String name;

    public String getName() {
        return name;
    }

    private double endurance;

    public double getEndurance() {
        return endurance;
    }
    private double jumpHeight;

    public double getJumpHeight() {
        return jumpHeight;
    }

    public Robot(String name, double endurance, double jumpHeight) {
        this.name = name;
        this.endurance = endurance;
        this.jumpHeight = jumpHeight;
    }

    public String jump() {
        return "Стрибає";
    }

    public String run() {
        return "Біжить";
    }

    public String getInfo() {
        return "Робот"+" "+"\""+getName()+"\"";
    }
}
