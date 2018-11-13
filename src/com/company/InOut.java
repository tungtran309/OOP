package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class InOut {
    public static Scanner reader = new Scanner(System.in);
    public static String readString(String message) {
        System.out.print(message);
        return reader.nextLine();
    }

    public static int readInt(String message) {
        System.out.print(message);
        int res = reader.nextInt();
        reader.nextLine();
        return res;
    }

    public static void printListStudent(ArrayList < Student > students) {
        if (students == null) {
            System.out.println("Not found");
        }   else {
            for (int i = 0; i < students.size(); i++) {
                Student student = students.get(i);
                if (student == null) {
                    continue;
                }
                student.printInfo();
            }
        }
    }

    public static void printListTeacher(ArrayList < Teacher > teachers) {
        if (teachers == null) {
            System.out.println("Not found");
        }   else {
            for (int i = 0; i < teachers.size(); i++) {
                Teacher teacher = teachers.get(i);
                if (teacher == null) {
                    continue;
                }
                teacher.printInfo();
            }
        }
    }

    public static void printListProjects(ArrayList < Project > projects) {
        if (projects == null) {
            System.out.println("Not found");
        }   else {
            for (int i = 0; i < projects.size(); i++) {
                Project project = projects.get(i);
                if (project == null) {
                    continue;
                }
                project.printInfo();
            }
        }
    }
}
