package com.university.data;

public abstract class Teacher extends Person {
    protected Double baseSalary;
    protected Double teacherSalary = (double) 0;
    protected String teacherType;

    public Teacher(String id, String name, Double baseSalary,String teacherType) {
        super(id, name);
        this.baseSalary = baseSalary;
        this.teacherType = teacherType;
    }

    public Double getSalary() {
        return teacherSalary;
    }

    public String getType() {
        return teacherType;
    }

    public void setSalary(Double salary) {
        this.teacherSalary = salary;
    }


}
