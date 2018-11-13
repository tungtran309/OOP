package com.company;

public class HustClass {
    private int id;
    private Course course;
    private Teacher teacher;

    public HustClass(int id, Course course, Teacher teacher, String room) {
        this.id = id;
        this.course = course;
        this.teacher = teacher;
        this.room = room;
    }

    private String room;

    public void printInfo() {
        System.out.println("course : " + course.getName() + " | " + "teacher : " + teacher.getFullName());
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

    public void setCourse(Course course) {
        this.course = course;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
