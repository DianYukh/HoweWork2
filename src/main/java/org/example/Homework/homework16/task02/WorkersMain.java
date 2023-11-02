package org.example.Homework.homework16.task02;

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

        Workers monthlyRate = new MonthlyRate("Іваненко", "20 %", 500, 21);
        Workers ratePerHour = new RatePerHour("Сидоренко", "20 %", 120, 48);
        Workers unitary = new Unitary("Петренко", "15%", 2, 5500);

        System.out.println("ПІБ         | Податок |   Сума(грн)   |  До сплати    |  ");
        System.out.println("-------------------------------------------------------");
        System.out.println(monthlyRate.getName() + "    | 20%     |   " + monthlyRate.salary() + "     |   " + (monthlyRate.salary() - monthlyRate.salaryTax()) + "      |    ");
        System.out.println("-------------------------------------------------------");
        System.out.println(ratePerHour.getName() + "   | 20%     |   " + ratePerHour.salary() +"      |   " + (ratePerHour.salary() - ratePerHour.salaryTax()) + "      |    ");
        System.out.println("-------------------------------------------------------");
        System.out.println(unitary.getName() + "    | 15%     |   " + unitary.salary() + "      |   " + (unitary.salary() - unitary.salaryTax()) + "      |    ");
        System.out.println("-------------------------------------------------------");

    }

}
