package com.company;

import java.util.ArrayList;

public class Project extends HustClass {

    private Student student;


    public Project(int id, Course course, Student student, Teacher teacher, String room) {
        super(id, course, teacher, room);
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void printInfo() {
        super.printInfo();
    }
}
