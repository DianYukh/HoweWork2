package org.example.Homework.homework19;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.reflect.Array.newInstance;
import static org.example.Homework.homework19.Task01.MyArray.displayArray;


public class Main {
    //Завдання 1: Створіть шаблонний клас Array,
// який являє собою масив,
// в якому зберігаються об'єкти заданого типу.
// Реалізуйте:
//  заповнення масиву з клавіатури;+
//  заповнення масиву випадковими числами;+
//  відображення масиву;
//  пошук максимального значення;
//  пошук мінімального значення;
//  підрахунок середнього арифметичного значення.
//  сортування масиву за зростанням;
//  сортування масиву за спаданням;
//  пошук значення в масиві, використовуючи бінарний пошук;
//  заміну значення в масиві на нове значення.
    public static void main(String[] args) {
        Task01.MyArray<Double> myArray = new Task01.MyArray<>();
        myArray.fillKeyBoardArr(Double.class);
        System.out.println(Arrays.toString(myArray.arr));


//        fillRandomArr2(myArray);
//        Task01.MyArray<Integer> myArray1 = new Task01.MyArray<>();
//        myArray1.fillRandomArr(Integer.class, 3);
//        System.out.println("Random Integer.class");
//        System.out.println(Arrays.toString(myArray1.arr));

//        myArray1.fillRandomArr(Double.class, 3);
//        System.out.println("Random Double.class");
//        System.out.println(Arrays.toString(myArray1.arr));
        Object myArray3 = Array.newInstance(Integer.class, 3);
        displayArray(myArray3);
    }
}
