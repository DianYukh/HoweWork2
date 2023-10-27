package org.example.Homework.homework15.task03;

public class Task03Main {
    //Створіть клас Money (Гроші) для роботи з грошовими сумами.
    //Число має бути представлене двома полями:
    // типу long – для гривень;
    // типу byte – для копійок.
    //Реалізуйте виведення значення на екран, при цьому дробова
    //частина має бути відокремлена комою від цілої частини.
    //Реалізуйте
    // додавання,
    // віднімання,
    // ділення сум,
    // *ділення суми на дробове число,*
    // *множення на дробове число та*
    // операції порівняння.
    public static void main(String[] args) {
        Money money = new Money(10L, (byte) 99);
        money.show();
        money.add(7L, (byte) 59);
        money.show();
        money.subtraction(6L, (byte) 98);
        money.show();
        money.division(2);
        money.show();
        money.equals(5L,(byte)80);

    }

}
