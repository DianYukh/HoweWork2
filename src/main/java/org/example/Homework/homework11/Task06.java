package org.example.Homework.homework11;

public class Task06 {
    //Напишіть метод, який перевіряє, чи є число простим. Число
    //передається як параметр. Якщо число просте, поверніть з методу
    //true, якщо ні — false.

    public static void main(String[] args) {
        int num = 509;
        if (prostoechislo(num)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean prostoechislo(int num) {
        int temp;
        boolean prostoe = true;
        for (int i = 2; i < num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                prostoe = false;
            }
        }
        return prostoe;
    }
}
