package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static DataModel dataModel = new DataModel();
    public static Scanner reader = new Scanner(System.in);

    public static String readString(String message) {
        System.out.println(message);
        return reader.nextLine();
    }

    public static int readInt(String message) {
        System.out.println(message);
        int res = reader.nextInt();
        reader.nextLine();
        return res;
    }

    public static void readNewStudent() {
        Student inputStudent = new Student(-1);
        inputStudent.setFirstName(readString("First Name   : "));
        inputStudent.setMiddleName(readString("Middle Name : "));
        inputStudent.setMiddleName(readString("Last Name   : "));
        inputStudent.setClassName(readString("Class name   : "));
        inputStudent.setId(readInt("id : "));
        dataModel.addNewStudent(inputStudent);
        menu();
    }

    public static void readNewTeacher() {
        Teacher inputTeacher = new Teacher(-1);
        inputTeacher.setFirstName(readString("First Name   : "));
        inputTeacher.setMiddleName(readString("Middle Name : "));
        inputTeacher.setMiddleName(readString("Last Name   : "));
        inputTeacher.setDeparment(readString("Department   : "));
        inputTeacher.setId(readInt("id : "));
        dataModel.addNewTeacher(inputTeacher);
        menu();
    }

    public static  void readNewClass() {
        Class inputClass = new Class();
        inputClass.setCourse(dataModel.findCourse(readInt("Add coure id : ")));
        inputClass.setId(readInt("Id : "));
        inputClass.setRoom(readString("Room : "));
        inputClass.setTeacher(dataModel.findTeacher(readInt("Add teacher id : ")));
        int number = readInt("Number student : ");
        for (int i = 1; i <= number; i++) {
            inputClass.addStudent(dataModel.findStudent(readInt(String.format("Id of student %d", i))));
        }

        dataModel.addNewClass(inputClass);
        menu();
    }

    public static void listStudentByCourseId() {
        ArrayList < Student > students = new ArrayList<>();
        int courseId = readInt("Course id : ");
        students = dataModel.getListStudentByCouseId(courseId);
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student == null) {
                continue;
            }
            student.printInfo();
        }
        menu();
    }

    public static void listStudentByTeacherId() {
        ArrayList < Student > students = new ArrayList<>();
        int teacherId = readInt("Teacher id : ");
        students = dataModel.getListStudentByTeacher(teacherId);
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student == null) {
                continue;
            }
            student.printInfo();
        }
        menu();
    }

    public static void listTeacherByStudentId() {
        ArrayList < Teacher > teachers = new ArrayList<>();
        int studentId = readInt("Student id : ");
        teachers = dataModel.getListTeacherByStudent(studentId);
        for (int i = 0; i < teachers.size(); i++) {
            Teacher teacher = teachers.get(i);
            if (teacher == null) {
                continue;
            }
            teacher.printInfo();
        }
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
        System.out.println(".............MORE..................");
        System.out.println("-----------------------------");
        int type = readInt("Your choice : ");
        switch (type) {
            case 1 : readNewStudent();
            case 2 : readNewTeacher();
            case 3 : readNewClass();
            case 4 : listStudentByCourseId();
            case 5 : listStudentByTeacherId();
            case 6 : listTeacherByStudentId();
        }
    }
}
