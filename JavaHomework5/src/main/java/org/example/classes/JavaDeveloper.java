package org.example.classes;

public class JavaDeveloper extends Employee{

    public JavaDeveloper(String name) {
        super(name);
    }

    @Override
    public String getPosition() {
        return "Java Developer";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }
}
