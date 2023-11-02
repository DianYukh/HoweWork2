package org.example.Homework.homework16.task02;

public class Unitary extends Workers {
    int numberTask;
    double amount;
    double tax; // Cтавка

    public Unitary(String name,  int tax, int numberTask, double amount) {
        super(name);
        this.numberTask = numberTask;
        this.amount = amount;
        this.tax = tax;
    }

//    public void numberTask() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введіть кількість завдань");
//        int numberTask = sc.nextInt();
//        double amount;
//        numberTask = sc.nextInt();
//        for (int i = 0; i < numberTask; i++) {
//            System.out.println("Введіть сумму за це завдання");
//            amount = sc.nextInt();
//            amount++;
//        }
//    }

    public double salary() {
        return amount++;
    }
    public double salaryTax() {
        return (salary() * this.tax)/100;
    }
}
