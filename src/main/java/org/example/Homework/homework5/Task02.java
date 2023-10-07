package org.example.Homework.homework5;

import java.util.Scanner;

public class Task02 {
    //Користувач вводить з клавіатури розмір сторони квадрата.
    //Виведіть на екран незаповнений квадрат (відображаються лише
    //межі квадрата). Розмір сторони дорівнює введеному розміру.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть сторону квадрату");
        int a = sc.nextInt(); // сторона квадрату


        for (int k = 0; k < a; k++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int j = 1; j < a - 1; j++) {
            System.out.print("* ");
            for (int l = 1; l < a - 1; l++) {
                System.out.print("  ");
            }
            System.out.println("* ");
        }
        for (int m = 0; m < a; m++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
