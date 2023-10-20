package org.example.Homework.homework12;

public class Task05 {
    // Дано натуральне число N. Виведіть всі його цифри по одній у
    //звичайному порядку, розділяючи їх пробілами або новими
    //рядками. Під час вирішення цього завдання не можна
    //використовуватирядки, списки, масиви, цикли. Дозволена лише
    //рекурсіяі цілочислова арифметика.
    //Введення: 179
    //Виведення: 1 7 9
    public static void main(String[] args) {
        straight(1235);
    }

    public static void straight(int n) {
        int temp = 0;
        int temp2 = 0;

        if (n < 10) {
            System.out.print(n + " ");
        } else {
            temp = n % 10;
            temp2 = n / 10;
            straight(temp2);
            System.out.print(temp + " ");
        }
    }


}
