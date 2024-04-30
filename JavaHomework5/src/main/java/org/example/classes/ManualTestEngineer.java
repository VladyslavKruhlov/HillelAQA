package org.example.classes;

import org.example.classes.Employee;

public class ManualTestEngineer extends Employee {
    protected final String lastName;

    public ManualTestEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPosition() {
        return "Manual Test Engineer";
    }

    @Override
    public String getSeniority() {
        return "Junior";
    }
}
