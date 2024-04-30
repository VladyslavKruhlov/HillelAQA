package org.example.classes;

public abstract class Employee {
    protected final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return null;
    }

    public abstract String getPosition();
    public abstract String getSeniority();

    public String getInfo() {
        if (getLastName()==null) {
            return getName() + " is a " +getSeniority() + " " +getPosition() +"\n";
        }
       return getName() + " " + getLastName() + " is a " +getSeniority() + " " +getPosition() +"\n";
    }

}
