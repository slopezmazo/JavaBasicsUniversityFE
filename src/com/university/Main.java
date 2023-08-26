package com.university;

import com.university.data.Teacher;
import com.university.data.University;
import com.university.data.Student;
import com.university.data.UniversityClass;
import com.university.persistance.Initializer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University university = new University();
        Scanner scanner = new Scanner(System.in);
        int choice=0;
        int choosenClass;

        init(university);

        do {
            try{
                System.out.println("Menu:");
                System.out.println("1. Print all the professors");
                System.out.println("2. Print a class info");
                System.out.println("3. Create and enroll a new student");
                System.out.println("4. Create a new class");
                System.out.println("5. List all the student classes");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        for (Teacher teacher : university.getTeachers()) {
                            System.out.println("Id: "+teacher.getId());
                            System.out.println("Name: "+teacher.getName());
                            System.out.println("Type: "+teacher.getType());
                            System.out.println("salary: "+teacher.getSalary());
                            System.out.println("---------------------");
                        }
                        break;
                    case 2:
                        System.out.println("Please pick a class");
                        while(true){
                            for(int i = 1; i<= university.getUniversityClasses().size(); i++) {
                                System.out.println(i+": "+ university.getUniversityClasses().get(i-1).getName());
                            }
                            choosenClass= scanner.nextInt();
                            if (choosenClass>=0 && choosenClass<= university.getUniversityClasses().size()){
                                UniversityClass selectedClass = university.getUniversityClasses().get(choosenClass-1);
                                System.out.println("Id: "+selectedClass.getId());
                                System.out.println("Name: "+selectedClass.getName());
                                System.out.println("Assigned classroom: "+selectedClass.getAssignedClassroom());
                                System.out.println("Teacher: "+selectedClass.getTeacher().getName());
                                System.out.println("Students:");
                                for(Student student : selectedClass.getClassStudents()) {
                                    System.out.println("<> "+student.getName());
                                }
                                System.out.println("---------------------");
                                break;
                            }
                            else {
                                System.out.println("Invalid choice. Please select a valid option.");
                            }
                        }
                        break;

                    case 3:
                        String id;
                        String name;
                        int age;
                        scanner.nextLine();
                        System.out.println("Please type the following: ");
                        System.out.println("Student id: ");
                        id = scanner.nextLine();
                        System.out.println("Full name: ");
                        name = scanner.nextLine();
                        System.out.println("Age: ");
                        age = scanner.nextInt();

                        //Validation of non-repeated data
                        boolean studentCheck = university.checkStudentExistence(id);
                        if(studentCheck){
                            System.out.println("The student with ID: "+id+" already exist");
                        }
                        else {
                            Student student = new Student(id,name,age);
                            university.addNewStudent(student);

                            System.out.println("Please pick a class");
                            boolean cond = true;

                            //Choice validations
                            while(cond){
                                for(int i = 1; i<=university.getUniversityClasses().size(); i++) {
                                    System.out.println(i+": "+ university.getUniversityClasses().get(i-1).getName());
                                }
                                choosenClass= scanner.nextInt();
                                if (choosenClass>=0 && choosenClass<= university.getUniversityClasses().size()){
                                    university.enrollStudent(choosenClass,student);
                                    System.out.println("Student created and enrolled correctly");
                                    System.out.println("---------------------");
                                    cond=false;
                                }
                                else {
                                    System.out.println("Invalid choice. Please select a valid option.");
                                }
                            }
                        }
                        break;

                    case 4:
                        // Implement code to create a new class and add a teacher, students, and data
                        break;

                    case 5:
                        // Implement code to list all classes in which a given student is included
                        break;

                    case 6:
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }

                scanner.nextLine();
                System.out.println("Please press enter to continue twice...");
                scanner.nextLine();
            } catch (java.util.InputMismatchException e){
                System.out.println("Invalid type input. Please select a valid option.");
            }
            scanner.nextLine();
        } while (choice != 6);

        scanner.close();
    }

    public static void init(University university){
        Initializer.initializeTeachers(university.getTeachers());
        Initializer.initializeStudents(university.getStudents());
        Initializer.initializeClasses(university.getUniversityClasses(),university.getStudents(),university.getTeachers());
    }
}

