package org.example.Homework.homework19;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class Task01 {

    public static class MyArray<T extends Number> {
        T[] arr;

        public void fillKeyBoardArr(Class<T> clazz) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть розмір масиву");
            int size = scanner.nextInt();
            arr = (T[]) Array.newInstance(clazz, size);
            System.out.println("Введіть числа через Enter");
            for (int i = 0; i < arr.length; i++) {
                Object tmp = null;
                if (clazz.isAssignableFrom(Integer.class)) {
                    tmp = scanner.nextInt();
                } else if (clazz == Double.class) {
                    tmp = scanner.nextDouble();
                }
//          tempArr[i] = (T)tmp;
                arr[i] = clazz.cast(tmp);
            }
        }

        //        public static void fillRandomArr2(Object array) {
//            int length = Array.getLength(array);
//            Random generator = new Random();
//            for (int i = 0; i < length; i++) {
//                int random = generator.nextInt(-100, 101);//заповнюємо випадковими значеннями
//                Array.setInt(array, i, random);
//            }
//        }
        public void fillRandomArr(Class<T> clazz, int size) {
            Random random = new Random();
            arr = (T[]) Array.newInstance(clazz, size);
            for (int i = 0; i < size; i++) {
                if (clazz == Integer.class) {
                    Array.set(arr, i, random.nextInt(-100, 100));
                } else if (clazz == Double.class) {
                    Array.set(arr, i, random.nextDouble());
                }

            }
        }

        static void displayArray(Object array) {
            if (array.getClass().isArray()) {
                int length = Array.getLength(array);
                for (int i = 0; i < length; i++) {
                    Object arrayElement = Array.get(array, i);
                    System.out.println(arrayElement);
                }
            }
        }
    }
}
