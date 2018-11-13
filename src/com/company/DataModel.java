package com.company;

import java.util.ArrayList;

/**
 * all datas store here
 */





public class DataModel {
    public static ArrayList < Student > listStudent = new ArrayList <Student>();
    public static ArrayList < Class > listClass = new ArrayList <Class>();
    public static ArrayList < Course > listCourse = new ArrayList <Course>();
    public static ArrayList < Teacher > listTeacher = new ArrayList <Teacher>();
    public static ArrayList < Project > listProjects = new ArrayList<>();

    public static Course findCourse(int courseId) {
        for (int i = 0; i < listCourse.size(); i++) {
            Course course = listCourse.get(i);
            if (courseId == course.getId()) {
                return course;
            }
        }
        return null;
    }

    public static Student findStudent(int studentId) {
        for (int i = 0; i < listStudent.size(); i++) {
            Student student = listStudent.get(i);
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public static Course findCourse(String courseName) {
        for (int i = 0; i < listCourse.size(); i++) {
            Course course = listCourse.get(i);
            if (courseName == course.getName()) {
                return course;
            }
        }
        return null;
    }

    public static Teacher findTeacher(int teacherId) {
        for (int i = 0; i < listTeacher.size(); i++) {
            Teacher teacher = listTeacher.get(i);
            if (teacherId == teacher.getId()) {
                return  teacher;
            }
        }

        return null;
    }

    public static ArrayList < Teacher > getListTeacherByStudent(int studentId) {
        ArrayList < Teacher > teachers = new ArrayList<>();
        for (Class curClass : listClass) {
            ArrayList < Student > students = curClass.getListStudents();
            for (Student student : students) {
                if (student.getId() == studentId) {
                    teachers.add(curClass.getTeacher());
                    break;
                }
            }
        }

        return teachers;
    }

    public static void addNewStudent(Student student) {
        listStudent.add(student);
    }

    public static void addNewTeacher(Teacher teacher) {
        listTeacher.add(teacher);
    }

    public static void addNewClass(Class newClass) {
        listClass.add(newClass);
    }

    public static ArrayList < Student > getListStudentByTeacher(int teacherId) {
        ArrayList < Student > students = new ArrayList<>();
        for (Class curClass : listClass) {
            if (curClass.getTeacher().getId() == teacherId) {
                for (Student student : curClass.getListStudents()) {
                    students.add(student);
                }
            }
        }
        return  students;
    }

    public static Student getStudentById(int studentId) {
        for (Student student : listStudent) {
            if (student.getId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public static ArrayList<Project> getListProjects() {
        return listProjects;
    }

    public static ArrayList<Student> getListStudentByCouseId(int courseId) {
        for (Class curClass : listClass) {
            if (curClass.getCourse().getId() == courseId) {
                return curClass.getListStudents();
            }
        }

        return null;
    }

    public static void createData() {
        listStudent.add(new Student(1, "Le", "Ba Truong", "Giang", "KSTN-CNTT"));
        listStudent.add(new Student(2, "Le", "Kha", "Hai", "KSTN-CNTT"));
        listStudent.add(new Student(3, "Le", "Anh",  "Duc", "KSTN-CNTT"));
        listStudent.add(new Student(4, "Tran", "Quang", "Huy", "KSTN-CNTT"));
        listStudent.add(new Student(5, "Le", "Cong", "Thanh", "KSTN-CNTT"));
        listStudent.add(new Student(6, "Le", "Minh", "Quang", "KSTN-CNTT"));
        listStudent.add(new Student(7, "Nguyen", "Huu", "Trang", "KSTN-CNTT"));
        listStudent.add(new Student(8, "Nguyen", "Thanh", "Chung", "KSTN-CNTT"));
        listStudent.add(new Student(9, "Tran", "Thanh", "Tung", "KSTN-CNTT"));

        listTeacher.add(new Teacher(1, "Nguyen", "Thanh", "Hung", "Vien Cong Nghe Thong Tin"));
        listTeacher.add(new Teacher(2, "Nguyen", "Kim", "Anh", "Vien Cong Nghe Thong Tin"));
        listTeacher.add(new Teacher(3, "Nguyen", "Thi Thu", "Trang", "Vien Cong Nghe Thong Tin"));

        listCourse.add(new Course(1, "Lap trinh huong doi tuong"));
        listCourse.add(new Course(2, "Tieng anh cong nghe thong tin"));
        listCourse.add(new Course(3, "Linux va phan mem nguon mo"));
        listCourse.add(new Course(4, "Project 1"));
        listCourse.add(new Course(5, "Project 2"));

        listClass.add( new Class(1, findCourse("Lap trinh huong doi tuong"), listStudent, findTeacher(1), "D6104"));
        listClass.add( new Class(1, findCourse("Tieng anh cong nghe thong tin"), listStudent, findTeacher(3), "D6102"));

        listProjects.add(new Project(1, findCourse("Project 1"), findStudent(1), findTeacher(2), "B1 803"));
        listProjects.add(new Project(2, findCourse("Project 2"), findStudent(2), findTeacher(2), "B1 803"));
        listProjects.add(new Project(3, findCourse("Project 1"), findStudent(3), findTeacher(1), "B1 503"));


        for (int i = 0; i < listStudent.size(); i++) {
            Student student = listStudent.get(i);
            student.addResult(new Result(findCourse("Lap trinh huong doi tuong"), 10, "20181"));
            student.addResult(new Result(findCourse("Lap trinh huong doi tuong"), 9, "20182"));
            student.addResult(new Result(findCourse("Tieng anh cong nghe thong tin"), 8, "20172"));
        }



    }
}
