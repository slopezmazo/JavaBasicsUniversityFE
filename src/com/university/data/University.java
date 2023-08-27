package com.university.data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
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
    public String getStudentNameById(String id){
        List<Student> filtered = this.students.stream().filter(student->id.equals(student.getId())).collect(Collectors.toList());
        if (filtered.size() > 0){
            return filtered.get(0).getName();
        }
        else {
            return "";
        }
    }
    public boolean checkClassExistence(String id){
        Stream<UniversityClass> filtered = this.universityClasses.stream().filter(universityClass->id.equals(universityClass.getId()));
        return filtered.count() > 0;
    }
    public void enrollStudent(int choosenIndex, Student student) {
        this.universityClasses.get(choosenIndex-1).enrollNewStudent(student);
    }

    public void addNewUniversityClasses(UniversityClass newUniversityClass) {
        this.universityClasses.add( newUniversityClass);
    }

    public ArrayList<UniversityClass> getStudentClasses(String id){
        ArrayList<UniversityClass> studentClasses = new ArrayList<>();
        for (UniversityClass universityClass : this.universityClasses){
            Stream<Student> filtered = universityClass.getClassStudents().stream().filter(student->id.equals(student.getId()));
            if (filtered.count() > 0){
                studentClasses.add(universityClass);
            }
        }

        return studentClasses;
    }
}
