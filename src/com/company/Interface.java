package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static DataModel dataModel = new DataModel();
    public static InOut inOut = new InOut();



    public static void readNewStudent() {
        Student inputStudent = new Student(-1);
        inputStudent.setFirstName(inOut.readString( "First Name  : "));
        inputStudent.setMiddleName(inOut.readString("Middle Name : "));
        inputStudent.setMiddleName(inOut.readString("Last Name   : "));
        inputStudent.setClassName(inOut.readString( "Class name  : "));
        inputStudent.setId(inOut.readInt("id : "));
        dataModel.addNewStudent(inputStudent);
        menu();
    }

    public static void readNewTeacher() {
        Teacher inputTeacher = new Teacher(-1);
        inputTeacher.setFirstName(inOut.readString( "First Name  : "));
        inputTeacher.setMiddleName(inOut.readString("Middle Name : "));
        inputTeacher.setLastName(inOut.readString("Last Name   : "));
        inputTeacher.setDeparment(inOut.readString( "Department  : "));
        inputTeacher.setId(inOut.readInt("id : "));
        dataModel.addNewTeacher(inputTeacher);
        menu();
    }

    public static  void readNewClass() {
        Class inputClass = new Class();
        inputClass.setCourse(dataModel.findCourse(  inOut.readInt("Coure id       : ")));
        inputClass.setId(                           inOut.readInt("Id             : "));
        inputClass.setRoom(                      inOut.readString("Room           : "));
        inputClass.setTeacher(dataModel.findTeacher(inOut.readInt("Teacher id     : ")));
        int number =                                inOut.readInt("Number student : ");
        for (int i = 1; i <= number; i++) {
            inputClass.addStudent(dataModel.findStudent(inOut.readInt(String.format("     Id of student %d:", i))));
        }

        dataModel.addNewClass(inputClass);
        menu();
    }

    public static void listStudentByCourseId() {
        ArrayList < Student > students = new ArrayList<>();
        int courseId = inOut.readInt("Course id : ");
        students = dataModel.getListStudentByCouseId(courseId);
        inOut.printListStudent(students);

        menu();
    }

    public static void listStudentByTeacherId() {
        ArrayList < Student > students = new ArrayList<>();
        int teacherId = inOut.readInt("Teacher id : ");
        students = dataModel.getListStudentByTeacher(teacherId);
        inOut.printListStudent(students);
        menu();
    }

    public static void listTeacherByStudentId() {
        ArrayList < Teacher > teachers = new ArrayList<>();
        int studentId = inOut.readInt("Student id : ");
        teachers = dataModel.getListTeacherByStudent(studentId);
        inOut.printListTeacher(teachers);
        menu();
    }

    public static void listAllProject() {
        ArrayList < Project > projects = dataModel.getListProjects();
        inOut.printListProjects(projects);
        menu();
    }

    public static void menu() {
        System.out.println("-----------MENU--------------");
        System.out.println("Press 1 to add new student : ");
        System.out.println("Press 2 to add new teacher : ");
        System.out.println("Press 3 to add new class  : ");
        System.out.println("Press 4 to list student by courseId");
        System.out.println("Press 5 to list student by teacherId");
        System.out.println("Press 6 to list teacher by studentId");
        System.out.println("Press 7 to list all project");
        System.out.println(".............MORE..................");
        System.out.println("-----------------------------");
        int type = inOut.readInt("Your choice : ");
        switch (type) {
            case 1 : readNewStudent();
            case 2 : readNewTeacher();
            case 3 : readNewClass();
            case 4 : listStudentByCourseId();
            case 5 : listStudentByTeacherId();
            case 6 : listTeacherByStudentId();
            case 7 : listAllProject();
        }
    }
}
