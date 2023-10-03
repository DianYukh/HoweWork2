package org.example.Homework.homework2;

import java.net.SocketOption;

public class Task10 {
    /* Завдання 10
Напишіть програму розрахунку ідеальної ваги до зросту. В
константах зберігаються зріст (height) і вага (weight). Виведіть в
консоль повідомлення про те, скільки кілограм потрібно набрати
або скинути (ідеальна вага = зріст - 110) */

    public static void main(String[] args) {
        final int height = 165; // зріст
        final double weight = 50.3; // вага

        int idealweight = height - 110; // ідеальна вага
        double gainweight = Math.ceil((idealweight - weight)*100.0)/100.0; // різница між ідеальною вагою та поточною (для набору маси)
        double dumpweight = Math.ceil((weight - idealweight) *100.0)/100.0; // різниця  між ідеальною вагою та поточною (для скидання маси)


        if (weight < idealweight){
            System.out.println("Вам потрібно добрати вагу на " + gainweight + "кг") ;
        } else if (weight > idealweight){
            System.out.println("Вам потрібно скину вагу на " + dumpweight  + "кг");
        } else if (weight == idealweight){
            System.out.println("У вас ідеальна вага");
        }

    }
}
