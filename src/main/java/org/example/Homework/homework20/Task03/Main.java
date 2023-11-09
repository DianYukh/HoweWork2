package org.example.Homework.homework20.Task03;

public class Main {
    //Завдання 3:
    //Створіть клас для підрахунку максимуму з чотирьох аргументів,
    //мінімуму з чотирьох аргументів, середнє арифметичне із
    //чотирьох аргументів, факторіалу аргументу. Функціональність
    //треба реалізувати у вигляді статичних методів.
    public static void main(String[] args) {
        System.out.println(Calculations.maxValue(5,6,80,45));
        System.out.println(Calculations.minValue(5,6,80,45));
        System.out.println(Calculations.average(11,8,81,45));
        System.out.println(Calculations.factorial(5));
    }
}
