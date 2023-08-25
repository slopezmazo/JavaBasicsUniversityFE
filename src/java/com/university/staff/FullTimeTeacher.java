package java.com.university.staff;

public class FullTimeTeacher extends Teacher{
    private int yearOfExperience;

    public FullTimeTeacher(String id, String name, Double baseSalary, int yearOfExperience, String teacherType) {
        super(id, name, baseSalary,teacherType);
        this.yearOfExperience = yearOfExperience;
        setSalary(this.baseSalary * (yearOfExperience*1.1));
    }
}
