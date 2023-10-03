package org.example.Homework.homework3.practichni;

import java.util.Scanner;

public class Task11 {
    // Обчисліть корні квадратного рівняння і виведіть їх на екран,
    //якщо вони є. Якщо коренів немає, то виведіть повідомлення про
    //це. Певне квадратне рівняння визначається коефіцієнтами: a, b,
    //c, які вводить користувач з клавіатури

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть коефіцієнт a ");
        double a = sc.nextDouble();
        System.out.println("Введіть коефіцієнт b ");
        double b = sc.nextDouble();
        System.out.println("Введіть коефіцієнт c ");
        double c = sc.nextDouble();

        double duskruminant = Math.pow(b, 2) - 4 * a * c;
        double x = - (b / 2 * a);
        double x1 = (-b  - Math.sqrt(duskruminant)) / 2 * a;
        double x2 = (-b  + Math.sqrt(duskruminant)) / 2 * a;


        if (duskruminant > 0){
            System.out.println("Перший корінь = " + x1);
            System.out.println("Другий корінь = " + x2);
        }else if
        (duskruminant == 0) {
            System.out.println("Єдиний корінь =" + x );
        } else {
            System.out.println("Дійсних коренів не має");
        }

    }

}
