package org.example.Homework.homework14;

import java.util.Scanner;

public class Task01Main {
    //Створіть програму, яка дозволяє ввести з клавіатури n
    //діапазонів цілочислових значень (наприклад, 3-10). Кожен
    //діапазон має початкову і кінцеву точку. Після введення, програма
    //має вивести довжину кожного діапазону. Програма має
    //виводити повідомлення про помилку, якщо початок діапазону
    //більший, ніж його кінець. Протестуйте з використанням JUnit.

    public static void main(String[] args) {

        Diapazon diapazon = new Diapazon();

        diapazon.EnterDiapazon();

//        for (int i = 0; i < diapazon.n; i++) {
            diapazon.lenght = diapazon.b - diapazon.a + 1;
            System.out.println("Довжина діапазону " + diapazon.lenght);
//        }
    }
}

