package org.example.Homework.homework33;

public class Calculator {
    //Завдання 2:
    //Створіть клас «Калькулятор». Реалізуйте клас з такою
    //функціональністю:
    //•Максимум з двох чисел.
    //•Мінімум з двох чисел.
    //•Відсоток числа.
    //•Піднесення числа до степеня.
    //Протестуйте всі можливості створеного класу з використанням JUnit.

    public int max(int first, int second) {

        return Math.max(first, second);
    }


    public int min(int first, int second) {

        return Math.min(first, second);
    }
    public double percent(double first, double percent){
        return (first*percent)/100;
    }
    public double power(double first, double power){
        return Math.pow(first,power);
    }

}
