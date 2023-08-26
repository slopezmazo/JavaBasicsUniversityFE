package com.university.data;

public abstract class Person {
    protected String personId;
    protected String personName;

    public Person(String id, String name) {
        this.personId = id;
        this.personName = name;
    }

    public String getId() {
        return personId;
    }

    public String getName() {
        return personName;
    }

}
