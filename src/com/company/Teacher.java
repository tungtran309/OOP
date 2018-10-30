package com.company;

public class Teacher extends HustHuman {
    private String deparment;

    public Teacher(int id) {
        super(id, "", "", "");
    }
    public Teacher(int id, String lastName, String middleName, String firstName, String deparment) {
        super(id, firstName, lastName, middleName);
        this.deparment = deparment;
    }

    public String getDeparment() {
        return deparment;
    }

    public void setDeparment(String deparment) {
        this.deparment = deparment;
    }

    public void printInfo() {
        System.out.println("Name : " + getFullName() + " | Deparment : " + deparment);
    }
}
