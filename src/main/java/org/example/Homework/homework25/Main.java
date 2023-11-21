package org.example.Homework.homework25;

import java.util.HashMap;
import java.util.Map;

public class Main {
//Створіть програму для роботи зі словником. Наприклад, англоіспанський,
// французько-німецький або інша мовна пара. Програма має:
//• надавати початкове введення даних для словника;
//• відображати слово та його переклади;
//• дозволяти додавати, змінювати, видаляти переклади слова;
//•дозволяти додавати, змінювати, видаляти слово;
//•відображати топ-10 найпопулярніших слів (визначаємо
//популярність спираючись на лічильник звернень);
//•відображати топ-10 найнепопулярніших слів (визначаємо
//непопулярність спираючись на лічильник звернень).

    public static void main(String[] args) {
        Map<String,String> dictionary = new HashMap<String,String>();
        dictionary.put("January", "січень");
        dictionary.put("February", "лютий");
        dictionary.put("March", "березень");
        dictionary.put("April", "квітень");
        dictionary.put("May", "травень");
        dictionary.put("June", "червень");
        dictionary.put("July", "липень");
        dictionary.put("August", "серпень");
        dictionary.put("September", "вересень");
        dictionary.put("October", "жовтень");
        dictionary.put("November", "листопад");
        dictionary.put("December", "грудень");

    }



}
