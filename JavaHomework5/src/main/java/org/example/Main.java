package org.example;

import org.example.classes.*;

public class Main {
    public static void main(String[] args) {

        JavaDeveloper javaDeveloper = new JavaDeveloper("Masha");
        AngularDeveloper angularDeveloper = new AngularDeveloper("Sasha");
        AutomationEngineer automationEngineer = new AutomationEngineer("Vlad", "Kruhlov");
        ManualTestEngineer manualTestEngineer = new ManualTestEngineer("Petro", "Petrov");
        Manager manager = new Manager("Ivan", "Ivanov");

        manager.team = new Employee[]{angularDeveloper,javaDeveloper, automationEngineer, manualTestEngineer};
        manager.setTeamMembers(manager.team);

        System.out.println("\n"+
                javaDeveloper.getInfo()+
                angularDeveloper.getInfo()+
                automationEngineer.getInfo()+
                manualTestEngineer.getInfo()+
                manager.getInfo());
    }
}