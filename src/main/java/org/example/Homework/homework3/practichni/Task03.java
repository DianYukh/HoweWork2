package org.example.Homework.homework3.practichni;

import java.util.Scanner;

public class Task03 {
   // Напишіть програму, яка пропонує користувачу обрати тварину зі
   //списку (1 — кіт, 2 — собака і т. д.), і увідповідь програма виводить
   //звуки, які видає вибрана тварина. Список має складатися не
   //менше, ніж з 10 тварин.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Натисніть число, щоб обрати тварину зі списку");
        System.out.println("1 - кіт");
        System.out.println("2 - собака");
        System.out.println("3 - корова");
        System.out.println("4 - коза");
        System.out.println("5 - овца");
        System.out.println("6 - порося");
        System.out.println("7 - тигр");
        System.out.println("8 - кінь");
        System.out.println("9 - вовк");
        System.out.println("10 - качка");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> System.out.println("мяу");
            case 2 -> System.out.println("гав");
            case 3 -> System.out.println("му");
            case 4 -> System.out.println("мє");
            case 5 -> System.out.println("бе");
            case 6 -> System.out.println("хрю");
            case 7 -> System.out.println("ррр");
            case 8 -> System.out.println("іго-го");
            case 9 -> System.out.println("аууу");
            case 10 -> System.out.println("кря");
            default -> System.out.println("Exit");
        }

    }
}
