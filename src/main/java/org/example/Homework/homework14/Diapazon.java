package org.example.Homework.homework14;

import java.util.Scanner;

public class Diapazon {
    int n;
    int a;
    int b;
    int lenght;

    public void EnterDiapazon() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть кількість n діапазонів ");
        n = sc.nextInt();

        System.out.println("Введіть початкову точку a діапазону ");
        a = sc.nextInt();

        System.out.println("Введіть кінцеву точку b діапазону ");
        b = sc.nextInt();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a > b) {
            this.a = a;
        } else {
            System.out.println("Помилкові дані. Спробуйте ще.");
        }
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;

    }
    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }
}
