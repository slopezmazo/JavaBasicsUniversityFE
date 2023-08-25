package java.com.university.universityclass;

import java.com.university.staff.Student;
import java.com.university.staff.Teacher;
import java.util.ArrayList;

public class UniversityClass {
    private String classId;
    private String className;
    private String classAssignedClassroom;
    private ArrayList<Student> classStudents;
    private Teacher classTeacher;

    public UniversityClass(String classId, String className, String classAssignedClassroom, ArrayList<Student> classStudents, Teacher classTeacher) {
        this.classId = classId;
        this.className = className;
        this.classAssignedClassroom = classAssignedClassroom;
        this.classStudents = classStudents;
        this.classTeacher = classTeacher;
    }

    public String getId() {
        return classId;
    }

    public String getName() {
        return className;
    }

    public String getAssignedClassroom() {
        return classAssignedClassroom;
    }

    public ArrayList<Student> getStudents() {
        return classStudents;
    }

    public Teacher getTeacher() {
        return classTeacher;
    }
}
