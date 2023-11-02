package org.example.Homework.homework17.task01;

public class FlashlightMain {
    //Створіть клас ліхтарика (Flashlight).
    //Додайте в клас ліхтарика:
    //  методи ввімкнення void on() та void off()для вимкнення ліхтарика;
    //  метод, що перевіряє стан ліхтарика boolean isLight();
    //  поле класу private boolean light, що зберігає поточний стан ліхтарика;
    //  реалізувати алгоритм ввімкнення і вимкнення ліхтарика.

    public static void main(String[] args) {
        Flashlight flashlight = new Flashlight();
        flashlight.on();
        //flashlight.off();
        System.out.println("Стан ліхтарика - " + flashlight.isLight());

    }

}
