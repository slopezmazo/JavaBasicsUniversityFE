package java.com.university.staff;

public class Student extends Person{
    private int age;

    public Student(String id, String name, int age) {
        super(id, name);
        this.age=age;
    }

    public int getAge() {
        return age;
    }
}
