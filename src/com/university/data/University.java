package com.university.data;

import java.util.ArrayList;
import java.util.stream.Stream;

public class University {
    private ArrayList<UniversityClass> universityClasses = new ArrayList<UniversityClass>();
    private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    private ArrayList<Student> students = new ArrayList<Student>();

    public ArrayList<UniversityClass> getUniversityClasses() {
        return this.universityClasses;
    }

    public ArrayList<Teacher> getTeachers() {
        return this.teachers;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }


    public void addNewStudent(Student student) {
        this.students.add(student);
    }
    public boolean checkStudentExistence(String id){
        Stream<Student> filtered = this.students.stream().filter(student->id.equals(student.getId()));
        return filtered.count() > 0;
    }
    public void enrollStudent(int choosenIndex, Student student) {
        this.universityClasses.get(choosenIndex-1).enrollNewStudent(student);

    }
}
