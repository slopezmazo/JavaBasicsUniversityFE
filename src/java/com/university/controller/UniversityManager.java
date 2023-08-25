package java.com.university.controller;

import java.com.university.staff.Student;
import java.com.university.staff.Teacher;
import java.com.university.universityclass.UniversityClass;
import java.util.ArrayList;

public class UniversityManager {
    public static ArrayList<UniversityClass> universityClasses = new ArrayList<UniversityClass>();
    public static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    public static ArrayList<Student> students = new ArrayList<Student>();

    public static void init(){
        Initializer.initializeTeachers(teachers);
        Initializer.initializeStudents(students);
        Initializer.initializeClasses(universityClasses,students,teachers);
    }
    public void CreateNewTeacher(){}
    public void CreateNewStudent(){}
    public void CreateNewClass(){}
    public ArrayList<UniversityClass> getStudentsClasses(String studentId){
        ArrayList<UniversityClass> studentUniversityClasses = new ArrayList<UniversityClass>();
        return null;
    }






}
