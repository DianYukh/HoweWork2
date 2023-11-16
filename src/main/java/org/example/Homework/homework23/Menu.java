package org.example.Homework.homework23;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    //Завдання 2:
    // Розробіть додаток, який дозволяє зберігати інформацію про логіни і паролі користувачів.
    // Кожному користувачу відповідає пара "логін — пароль".
    // При старті додатку відображається меню:
    // 1. Додати нового користувача.
    // 2. Видалити існуючого користувача.
    // 3. Перевірити, чи існує такий користувач.
    // 4. Змінити логін існуючого користувача.
    // 5. Змінити пароль існуючого користувача.
    // Дія виконується залежно від вибору користувача,
    // після чого меню з'являється знову.
    // Для вирішення завдання використовуйте відповідний клас з Java Collections Framework.
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Виберіть операцію");
        List<String> users = new ArrayList<>();

        while (true) {
            System.out.println("1 Додати нового користувача.");
            System.out.println("2 Видалити існуючого користувача.");
            System.out.println("3 Перевірити, чи існує такий користувач.");
            System.out.println("4 Змінити логін існуючого користувача.");
            System.out.println("5 Змінити пароль існуючого користувача.");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> add(users, scanner);
                case 2 -> remove(users, scanner);
                case 3 -> check(users, scanner);

            }

        }
    }


    public static void add(List<String> list, Scanner scanner) {
        System.out.println("Додати нового користувача ");
        list.add(scanner.next());
    }

    public static void remove(List<String> list, Scanner scanner) {
        System.out.println("Видалити існуючого користувача.");
        list.remove(scanner.next());
    }

    public static void check(List<String> list, Scanner scanner) {
        if (list.contains(scanner.next())) {
            System.out.println("Такий користувач вже існує.");
        } else {
            System.out.println("НЕ існує.");
        }
    }
    public static void show(List<String> list) {
        System.out.println(list);
    }
}

