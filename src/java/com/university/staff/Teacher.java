package java.com.university.staff;

public abstract class Teacher extends Person {
    protected Double baseSalary;
    protected Double salary = (double) 0;

    public Teacher(String id, String name, Double baseSalary) {
        super(id, name);
        this.baseSalary = baseSalary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
