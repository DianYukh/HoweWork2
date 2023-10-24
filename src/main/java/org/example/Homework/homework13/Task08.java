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
        int k = 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = k++;
                }
            } else {
                for (int j = array[i].length -1; j >=0  ; j--) {
                    array[i][j] = k++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
