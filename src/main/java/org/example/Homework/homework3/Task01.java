package org.example.Homework.homework3;

import java.util.Scanner;

public class Task01 {
    //Напишіть програму, яка пропонує користувачу ввести з
    //клавіатури номер дня тижня, і у відповідь показує назву цього
    //дня (наприклад, 6 — субота). Розв'яжіть завдання з
    //використанням switch.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть номер дня тижня");
        int day = sc.nextInt();

        switch (day){
            case 1 -> System.out.println("Понеділок");
            case 2 -> System.out.println("Вівторок");
            case 3 -> System.out.println("Середа");
            case 4 -> System.out.println("Четвер");
            case 5 -> System.out.println("П'ятниця");
            case 6 -> System.out.println("Субота");
            case 7 -> System.out.println("Неділя");
            default -> System.out.println("Вихід");

        }
    }
}
