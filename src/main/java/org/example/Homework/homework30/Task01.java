package org.example.Homework.homework30;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public class Task01 {
    //Завдання 1:
//При старті додатку запускаються три потоки. Перший потік
//заповнює масив випадковими числами. Два інші потоки очікують
//на заповнення. Коли масив заповнений, обидва потоки
//запускаються. Перший потік знаходить суму елементів масиву,
//другий потік — середнє арифметичне значення в масиві.
//Отриманий масив, сума і середнє арифметичне повертаються в
//метод main, де мають бути відображені.

    public static void main(String[] args) throws InterruptedException {

        int[] arr = new int[5];
        ArrThread arrThread = new ArrThread(arr);

        arrThread.threads();
        System.out.println(Arrays.toString(arrThread.getArr()));
        System.out.println("sum = " + arrThread.sum);
        System.out.println("averege = " + arrThread.average);
    }

    static class ArrThread {
        int sum = 0;
        double average = 0;

        int[] arr;

        public ArrThread(int[] arr) {
            this.arr = arr;
        }

        public int[] getArr() {
            return arr;
        }

        public void setArr(int[] arr) {
            this.arr = arr;
        }

        public void threads() throws InterruptedException {
            AtomicBoolean done = new AtomicBoolean(false);

            Thread fillArray = new Thread(() -> {
                synchronized (this) {
                    Random random = new Random();
                    for (int i = 0; i < arr.length; i++) {
                        arr[i] = random.nextInt(10, 100);
                    }
                    notifyAll();
                    done.set(true);
                }
            });


            Thread sumArray = new Thread(() -> {
                synchronized (this) {
                    try {
                        while (done.get() == false) {
                            wait();
                        }

                        for (int i = 0; i < arr.length; i++) {
                            sum += arr[i];
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            });

            Thread averageArray = new Thread(() -> {
                synchronized (this) {
                    try {
                        while (done.get() == false) {
                            wait();
                        }

                        for (int i = 0; i < arr.length; i++) {
                            sum += arr[i];
                        }
                            average = (double) sum / arr.length;
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            });

            fillArray.start();
            sumArray.start();
            averageArray.start();


            fillArray.join();
            sumArray.join();
            averageArray.join();
        }


    }

}

