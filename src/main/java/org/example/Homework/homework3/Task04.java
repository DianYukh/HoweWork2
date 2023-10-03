package org.example.Homework.homework3;

public class Task04 {
    //Дана точка на площині задана координатами x та y. Визначіть і
    //виведіть в консоль, в якій чверті (у прямокутній (декартовій)
    //системі координат) знаходиться точка. Чверті позначені
    //римськими цифрами
    public static void main(String[] args) {
        double x = 0;
        double y = 0;

        if (x > 0 && y > 0){
            System.out.println("Точка А знаходиться у І чверті");
        } else if (x < 0 && y > 0) {
            System.out.println("Точка А знаходиться у ІI чверті");
        } else if (x < 0 && y < 0) {
            System.out.println("Точка А знаходиться у ІII чверті");
        } else if (x > 0 && y < 0) {
            System.out.println("Точка А знаходиться у ІV чверті");
        } else if (x == 0 && y == 0) {
            System.out.println("Точка А знаходиться на початку координат");
        } else  {
            System.out.println("Точкм А знаходиться на осях координат");
        }


    }
}
