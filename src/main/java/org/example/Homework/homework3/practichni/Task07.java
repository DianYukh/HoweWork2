package org.example.Homework.homework3.practichni;

import java.util.Scanner;

public class Task07 {
    //Завдання 7
    //Користувач вводить з клавіатури літеру. Програма має
    //визначити, в якій розкладці введена літера — латиницею або
    //кирилицею. Виведіть в консоль: слово «латиниця», якщолітера
    //введена латиницею, або «кирилиця», якщо літера відноситься до
    //кириличного алфавіту. Якщо введено цифру, а не літеру, виведіть
    //слово «цифра». Якщо символ не відноситься а ні до літери, а ні до
    //цифри, виведіть фразу: «неможливо визначити».
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть літеру або цифру або символ ");
        String str = sc.next();

        char ch = str.charAt(0);

        if (ch > 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'){
            System.out.println("Латиниця");
        }else if(ch > 'А' && ch <= 'Я' || ch >= 'а' && ch <= 'я'){
            System.out.println("Кирилиця");
        }else if(ch > '0' && ch <= '9'){
            System.out.println("Цифра");
        }else {
            System.out.println("Неможливо визначити");
        }



    }
}
