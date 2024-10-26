package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String count;
    int height;
    String email;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String count, int height, String email) {
        this(firstName, lastName, age);
        this.count = count;
        this.height = height;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        if (13 < age && 19 > age) {
            return true;
        }
        return false;

    }
}
