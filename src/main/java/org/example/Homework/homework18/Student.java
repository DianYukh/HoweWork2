package org.example.Homework.homework18;

import java.util.Arrays;

public class Student {
    String name;
    String dateOfBirth;
    Marks marks;

    public Student(Marks marks) { // агрегация
        this.marks = marks;
    }

    public Student() {
    }

    public Student(String name, String dateOfBirth, Marks marks) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.marks = marks;
    }

    public void show() {
        System.out.print(name + " " + dateOfBirth + " " + Arrays.toString(marks.getMarks()) + " " + marks.avarageMark());
    }
}
