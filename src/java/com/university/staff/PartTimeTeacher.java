package java.com.university.staff;

public class PartTimeTeacher extends Teacher {
    private int activeHoursWeek;

    public PartTimeTeacher(String id, String name, Double baseSalary, int activeHoursWeek, String teacherType) {
        super(id, name, baseSalary,teacherType);
        this.activeHoursWeek = activeHoursWeek;
        setSalary(this.baseSalary * activeHoursWeek);
    }
}
