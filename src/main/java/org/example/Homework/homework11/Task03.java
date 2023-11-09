package org.example.Homework.homework11;

public class Task03 {
    //Напишіть метод, який відображає горизонтальну або
    //вертикальну лінію з певного символу. Метод приймає як
    //параметр: довжину лінії, напрям, символ.
    public static void main(String[] args) {
        char symbol = '*';
        int length = 5;
        String direct = "horisontal"; //horisontal

        line(direct, length, symbol);
    }
    public static void line(String direct, int length, char symbol) {
        boolean contains1 = direct.contains("vertikal");
        boolean contains2 = direct.contains("horisontal");

        if (contains1) {
            for (int k = 0; k < length; k++) {
                System.out.println(symbol);
            }
        }
        if (contains2) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
        }
    }
}
