package java.com.university.controller;

import java.com.university.staff.FullTimeTeacher;
import java.com.university.staff.PartTimeTeacher;
import java.com.university.staff.Student;
import java.com.university.staff.Teacher;
import java.com.university.universityclass.UniversityClass;
import java.util.ArrayList;

public class Initializer {
    public static void initializeTeachers(ArrayList<Teacher> teachers){
        //full time teachers (2)
        teachers.add(new FullTimeTeacher("2001", "Jhon", (Double)2500000.00, 2,"Full-time"));
        teachers.add(new FullTimeTeacher("2002", "Elane", (Double)4000000.00, 10,"Full-time"));

        //part-time teachers (2)
        teachers.add(new PartTimeTeacher("2003","Carlos",(Double)3000000.00,12,"Part-time"));
        teachers.add(new PartTimeTeacher("2004","Eddy",(Double)2000000.00,15,"Part-time"));
    }
    public static void initializeStudents( ArrayList<Student> students){
        students.add(new Student("1001", "Alice", 20));
        students.add(new Student("1002", "Bob", 21));
        students.add(new Student("1003", "Charlie", 19));
        students.add(new Student("1004", "David", 22));
        students.add(new Student("1005", "Eve", 18));
        students.add(new Student("1006", "Frank", 23));
    }
    public static void initializeClasses( ArrayList<UniversityClass> universityClasses, ArrayList<Student> classStudents, ArrayList<Teacher> classTeachers){
        UniversityClass class1 = new UniversityClass("1001", "Differential calculus","14-301",  classStudents, classTeachers.get(0));
        UniversityClass class2 = new UniversityClass("1002", "Integral calculus","14-403",  classStudents, classTeachers.get(1));
        UniversityClass class3 = new UniversityClass("1003", "Object Oriented Programming","8-201",  classStudents, classTeachers.get(2));
        UniversityClass class4 = new UniversityClass("1004", "Linear algebra","14-301",  classStudents, classTeachers.get(3));

        universityClasses.add(class1);
        universityClasses.add(class2);
        universityClasses.add(class3);
        universityClasses.add(class4);
    }
}
