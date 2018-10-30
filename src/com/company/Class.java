package com.company;

import java.util.ArrayList;

public class Class {
    private int id;
    private Course course;
    private ArrayList < Student > listStudents = new ArrayList<>();
    private Teacher teacher;
    private String room;

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Class() {

    }

    public Class(int id, Course course, ArrayList<Student> listStudents, Teacher teacher, String room) {
        this.id = id;
        this.course = course;
        this.listStudents = listStudents;
        this.teacher = teacher;
        this.room = room;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Course getCourse() {
        return course;
    }

    public void addStudent(Student student) {
        listStudents.add(student);
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
