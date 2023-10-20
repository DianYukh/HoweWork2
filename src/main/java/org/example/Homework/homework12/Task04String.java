package org.example.Homework.homework12;

public class Task04String {
    //Дано натуральне число N. Виведіть всі його цифри по одній у
    //зворотному порядку через пробіл. Дозволена тільки рекурсія і
    //цілочислова арифметика.
    //Введення: 179
    //Виведення: 9 7 1




    // знайшла в інтернеті такий метод, показався дуже цікавий
    public static void main(String[] args) {
        String s = "179";

        if(s.length() > 0) {
            reverseString(s, s.length() - 1);
        }
    }

    public static void reverseString(String s, int index) {
        if(index == 0) {
            System.out.println(s.charAt(index));
            return;
        }
        System.out.print(s.charAt(index) + " ");
        reverseString(s, index - 1);
    }
}
