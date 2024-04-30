package org.example.classes;

import java.util.Arrays;

public class Manager extends Employee{
    private final String lastName;
    public Employee[] team;

    public String setTeamMembers(Employee[] team) {

        String [] members = new String[team.length];

        for(int i=0; i<team.length; i++){
            members[i] = team[i].getName();
        }

        return Arrays.toString(members);
    };

    public Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getPosition() {
        return "Manager";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }

    public String getLastName() {
        return lastName;
    }

    public String getInfo() {
        if (getLastName()==null) {
            return getName() + " is a " +getSeniority() + " " +getPosition() +"\n";
        }
        return getName() + " " + getLastName() + " is a " +getSeniority() + " " +getPosition() +" and has a team of "+ team.length +" members: "+setTeamMembers(team);
    }
}
