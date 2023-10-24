package org.example.Homework.homework13;

import java.util.Scanner;

public class Task08 {
    //Заповніть n-мірний квадратний масив числами, які
    //збільшуються на 1 по спіралі (число n задається з клавіатури).
    //Виведіть результат на екран дотримуючись ширини стовпців.
    //Наприклад, масив 4х4 має відповідати прикладу, зображеному
    //нижче.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмірність n масиву: ");

        int n = sc.nextInt();
        int[][] array = new int[n][n];
        int k = 0; // кількість
        int beginI = 0; // початок рядків
        int endI = n - 1; // кінець рядків
        int beginJ = 0;  // початок стовпчиків
        int endJ = n - 1; // кінець стовпчиків
        int max = n * n;

        while (k < max) {
            for (int i = beginJ; i <= endJ; i++) {
                array[beginI][i] = k++;
            }
            beginI = beginI + 1;
            for (int i = beginI; i <= endI; i++) {
                array[i][endJ] = k;
                k++;
            }
            endJ = endJ - 1;
            for (int i = endJ; i >= beginJ; i--) {
                array[endI][i] = k;
                k++;
            }
            endI = endI - 1;
            for (int i = endI; i >= beginI; i--) {
                array[i][beginJ] = k;
                k++;
            }
            beginJ = beginJ + 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}