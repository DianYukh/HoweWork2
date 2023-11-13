package org.example.Homework.homework21;

import java.util.Scanner;

public class Menu {


    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int machineChoice = scanner.nextInt();

        //обрати кавомашину

        System.out.println("Оберіть кавомашину");
        System.out.println("1 - Philips");
        System.out.println("2 - Siemens");
        switch (machineChoice) {
            case 1-> System.out.println("Ви обрали кавоварку Philips");
            case 2-> System.out.println("Ви обрали кавоварку Siemens");
        }

        //обрати операцію
        System.out.println("Оберіть операцію");
        System.out.println("1 - еспрессо");
        System.out.println("2 - зробити амерікано");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Ви обрали еспрессо");
            case 2 -> System.out.println("Ви обрали амерікано");
        }
    }


}
