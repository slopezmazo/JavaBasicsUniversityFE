package java.com.university;

import java.com.university.controller.UniversityManager;
import java.com.university.staff.Student;
import java.com.university.staff.Teacher;
import java.com.university.universityclass.UniversityClass;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        UniversityManager.init();

        do {
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
                    for (Teacher teacher : UniversityManager.teachers) {
                        System.out.println("Id: "+teacher.getId());
                        System.out.println("Name: "+teacher.getName());
                        System.out.println("Type: "+teacher.getType());
                        System.out.println("salary: "+teacher.getSalary());
                        System.out.println("-------------------- ");
                    }
                    break;

                case 2:
                    int choicedClass=0;
                    System.out.println("Please pick a class");
                    for(int i=1;i<=UniversityManager.universityClasses.size();i++) {
                        System.out.println(i+": "+UniversityManager.universityClasses.get(i-1).getName());
                        choicedClass= scanner.nextInt();
                    }
                    UniversityClass selectedClass = UniversityManager.universityClasses.get(choicedClass-1);
                    System.out.println("Id: "+selectedClass.getId());
                    System.out.println("Name: "+selectedClass.getName());
                    System.out.println("Assigned classroom: "+selectedClass.getAssignedClassroom());
                    System.out.println("Teacher: "+selectedClass.getTeacher().getName());
                    for(Student student : selectedClass.getStudents()) {
                        System.out.println("<> "+student.getName());
                    }
                    System.out.println("-------------------- ");
                    break;

                case 3:
                    // Implement code to create a new student and add them to an existing class
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
        } while (choice != 6);

        scanner.close();
    }
    }
}