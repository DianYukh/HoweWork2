package org.example.Homework.homework20.Task02;

public class Main {
    //Завдання 2:
    // Створіть клас для розрахунку площі геометричних фігур.
    // Клас має надавати функціональність для підрахунку площі
    // трикутника за різними формулами,+
    // площі прямокутника,+
    // площі квадрата,+
    // площі ромба.+

    // Методи класу для підрахунку площі реалізуйте
    // за допомогою статичних методів.
    // Також клас має розрахувати кількість підрахунків площі
    // та повернути це значення статичним методом.

    public static void main(String[] args) {
        System.out.println(Areas.rhombusArea(15, 30));
        System.out.println(Areas.triangleAreas(5,4));
        System.out.println(Areas.rectangeArea(10,7));
        System.out.println(Areas.squareArea(5));
        System.out.println(Areas.getCount());

    }
}
