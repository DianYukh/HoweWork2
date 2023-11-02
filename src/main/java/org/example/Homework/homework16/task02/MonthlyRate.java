package org.example.Homework.homework16.task02;

public class MonthlyRate extends Workers {
    double dailyRate;
    double sal;
    int numberDays;
    double tax; // Cтавка

    public MonthlyRate(String name, String tax, double dailyRate, int numberDays) {
        super(name);
        this.dailyRate = dailyRate;
        this.numberDays = numberDays;
        this.tax=0.20;

    }
    public double salary() {
        return dailyRate * numberDays;
    }

    public double salaryTax() {
        return salary() * this.tax;
    }
}
