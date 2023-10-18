package org.example.Homework.homework1;

public class Task01 {
 /*Метод запускає програму, представляє початкову точку програми.
      У Java кожен додаток повинен містити метод main, який є точкою входу для програми.
      JVM (віртуальна машина Java) починає своє виконання, викликаючи основний метод
      зазначеного класу, і main() згодом викличе всі інші методи, потрібні програмою.*/

    public static void main(String[] args) {
        String name = "Diana Yukhymuk";
        String field = "Mathematics and Computer Science";
        String email = "dianayukhymukua@gmail.com";
        String phone = "+380952576988";
        String name2 = "Milana";

        int age = 32;
        int exp = 10;
        int ch = 1;

        System.out.println("My name is " + name + ". I'm " + age + ".\n" + "I'm educator with " + exp + " years experience on the " + field + ".");
        // System.out.printf("My name is %s. I'm %d.\nI'm educator with %d years experience on the %s\n", name, age, exp, field); //- the same with other method "printf"
        System.out.println("------------------");
        System.out.println("Personal information: phone number - " + phone + ", Email adress - " + email);
        System.out.println("------------------");
        System.out.println("I'm very hardworking, responsible, diligent and sociable person with a good sense of humor.\nI have " + ch + " adorable daughter. Her name is " + name2 + ":)");


    }
}
