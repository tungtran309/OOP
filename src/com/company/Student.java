package com.company;

import java.util.ArrayList;

public class Student extends HustHuman {
    private String className;
    private ArrayList < Result > listResult = new ArrayList<>();
    public Student(int id) {
        super(id, "", "", "");
    }
    public Student(int id, String lastName, String middleName, String firstName, String className) {
        super(id, firstName, lastName, middleName);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ArrayList<Result> getListResult() {
        return listResult;
    }

    public void setListResult(ArrayList<Result> listResult) {
        this.listResult = listResult;
    }

    public void addResult(Result result) {
        this.listResult.add(result);
    }

    public void printInfo() {
        System.out.println("Name : " + getFullName() + " | MSSV : " + id + " | Class : " + className);
    }

    public void printFullInfo() {
        printInfo();
        for (Result result : listResult) {
            result.printInfo();
        }
    }
}
