package org.example.Homework.homework11;

public class Task04 {
    //Напишіть метод, який повертає максимальне з чотирьох чисел.
    //Числа передаються як параметри
    public static void main(String[] args) {
        int a = 100;
        int b = -5;
        int c = 15;
        int d = 45;
        System.out.println(maxMetod(a, b, c, d));
    }

    public static int maxMetod(int a, int b, int c, int d) {
    int max;
        if (a > b && a > c && a > d) {
            max= a;
        } else {
            if (b > c && b > d) {
                max=b;
            } else {
                if (c > d) {
                    max=c;
                } else {
                    max=d;
                }
            }
        }return max;
    }
}
