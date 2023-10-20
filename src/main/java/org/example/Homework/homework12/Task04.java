package org.example.Homework.homework12;

public class Task04 {
    //Дано натуральне число N. Виведіть всі його цифри по одній у
    //зворотному порядку через пробіл. Дозволена тільки рекурсія і
    //цілочислова арифметика.
    //Введення: 179
    //Виведення: 9 7 1
    public static void main(String[] args) {
    reverse(1235);
    }

  public static void reverse(int n) {
        int temp = 0;
        int temp2 = 0;

        if (n < 10) {
            System.out.println(n + " ");
        } else {
            temp = n % 10;
            System.out.print(temp + " ");
            temp2 = n / 10;
            reverse(temp2);
        }
    }
}
