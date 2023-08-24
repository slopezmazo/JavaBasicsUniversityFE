package java.com.university.staff;

public class FullTimeTeacher extends Teacher{
    private int yearOfExperience;

    public FullTimeTeacher(String id, String name, Double baseSalary, int yearOfExperience) {
        super(id, name, baseSalary);
        this.yearOfExperience = yearOfExperience;
        setSalary(this.baseSalary * (yearOfExperience*1.1));
    }
}
