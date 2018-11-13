package com.company;

import java.util.ArrayList;

public class Class extends HustClass {

    private ArrayList < Student > listStudents = new ArrayList<>();

    public Class() {
        super(-1, null, null, null);
    }
    public Class(int id, Course course, ArrayList<Student> listStudents, Teacher teacher, String room) {
        super(id, course, teacher, room);
        this.listStudents = listStudents;
    }

    public void addStudent(Student student) {
        listStudents.add(student);
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

}
