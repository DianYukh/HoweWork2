package org.example.Homework;

public class Task06 {

    /*Є прямокутник, в якого відома ширина w і висота h. Обчисліть і
виведіть в консоль периметр і площу заданого прямокутника.
Висота і ширина прямокутника має задаватися константними
змінними в кодіпрограми. */
    public static void main(String[] args){
        final double w = 10.5;
        final double h = 5.5;

        double p = 2 * w + 2 * h;
        double s = w * h;

        System.out.println("Периметр прямокутника = "+ p + " см");
        System.out.println("Площа прямокутника = "+ s + " см^2");


    }


}
