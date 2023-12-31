package org.example.Homework.homework16.task01;

public class WorkersMain {
    //Розробіть і протестуйте набір класів для вирішення завдання
    //підрахунку заробітної плати співробітників якоїсь фірми.
    //На фірмі є декілька способів оплати праці:
    // ставка — вказується, скільки співробітник отримує за
    //робочий день; по кожному співробітнику записується
    //кількість відпрацьованих днів в місяці;
    // погодинна — вказується, скільки співробітник отримує
    //оплату в годину; по кожному співробітнику записується
    //кількість відпрацьованих годин в місяць;
    // відрядна — вказується, скільки співробітник отримає за
    //виконану роботу; по кожному співробітнику записуються
    //суми з кожного виконаного завдання, яке працівник встиг
    //виконати за місяць.
    //Програма має вміти виводити звіт по всіх працівниках фірми
    //про заробітну плату у такому вигляді
    public static void main(String[] args) {

        Workers monthlyRate = new MonthlyRate("Іваненко", "ставка", 500, 21);
        Workers ratePerHour = new RatePerHour("Сидоренко", "погодинна", 120, 48);
        Workers unitary = new Unitary("Петренко", "відрядна", 2, 5500);

        System.out.println("ПІБ         | Вид оплати |   Сума    |   ");
        System.out.println("--------------------------------------");
        System.out.println(monthlyRate.getName() + "    | ставка     |   " + monthlyRate.salary()+" |");
        System.out.println("--------------------------------------");
        System.out.println(ratePerHour.getName() + "   | погодинна  |   " + ratePerHour.salary()+"  |");
        System.out.println("--------------------------------------");
        System.out.println(unitary.getName() + "    | відрядна   |   " + unitary.salary()+"  |");
        System.out.println("--------------------------------------");

        double total = monthlyRate.salary() + ratePerHour.salary() + unitary.salary();

        System.out.println("Разом                    |   " + total +" |");
        System.out.println("--------------------------------------");
    }

}
