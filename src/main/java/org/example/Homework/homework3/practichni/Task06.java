package org.example.Homework.homework3.practichni;

import java.util.Scanner;

public class Task06 {
// Визначіть кількість днів в році, який вводить користувач, і
//виведіть їх у консоль. У високосному році 366 днів, тоді як у
//звичайному — 365. Високосний рік — це той, що ділиться націло
//на 4, за винятком століть, які не діляться націло на 400
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть рік");

    int year = sc.nextInt();

    if ((year % 4 == 0) || year % 400 ==0 ){
        System.out.println("Високосний рік - 366 днів");
    }else System.out.println("365 днів");
}
}
