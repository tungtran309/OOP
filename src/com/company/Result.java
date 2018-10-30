package com.company;

public class Result {
    private Course course;
    private int score;
    private String semester;

    public Result(Course course, int score, String semester) {
        this.course = course;
        this.score = score;
        this.semester = semester;
    }


    public void printInfo() {
        System.out.println("Course : " + course.getName() + " " + semester + " | Score : " + score);
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        score = score;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
