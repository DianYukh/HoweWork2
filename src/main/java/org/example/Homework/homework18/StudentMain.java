package org.example.Homework.homework18;

import java.util.Arrays;

public class StudentMain {
    // Программа должна выводить на экран список студентов
    // группы указывая в строчку через пробел фамилию, год
    // рождения, три оценки и средний бал.
    // Необходимо разработать систему классов для реализации программы.
    // Для хранения информации о студенте создайте класс Student.
    public static void main(String[] args) {

        System.out.println("Прізвище Датанародж    Оцінки   Середній бал ");
        Marks marks1 = new Marks(new int[]{12, 9, 10});
        Student student1 = new Student("Іваненко", "12.10.1998", marks1);
        student1.show();
        System.out.println();

        Marks marks2 = new Marks(new int[]{10, 8, 11});
        Student student2 = new Student("Сидренко", "05.04.1990", marks2);
        student2.show();
        System.out.println();

        Marks marks3 = new Marks(new int[]{11, 6, 10});
        Student student3 = new Student("Петренко", "24.07.1993", marks3);
        student3.show();

    }
}
