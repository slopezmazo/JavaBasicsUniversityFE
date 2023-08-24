package java.com.university.staff;

public class PartTimeTeacher extends Teacher {
    private int activeHoursWeek;

    public PartTimeTeacher(String id, String name, Double baseSalary, int activeHoursWeek) {
        super(id, name, baseSalary);
        this.activeHoursWeek = activeHoursWeek;
        setSalary(this.baseSalary * activeHoursWeek);
    }
}
