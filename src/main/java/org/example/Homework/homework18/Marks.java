package org.example.Homework.homework18;

import java.util.Arrays;

public class Marks {
    int[] marks = new int[3];

    public Marks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public boolean toStringMarks(){
    System.out.println(Arrays.toString(marks));

    return true;
}
    public double avarageMark() {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return (double) Math.round(sum /marks.length);
    }

}
