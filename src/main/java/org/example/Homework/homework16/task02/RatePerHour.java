package org.example.Homework.homework16.task02;

public class RatePerHour extends Workers {
    double hourRate;
    int numberHours;
    String paymentMethod;
    int tax; // Cтавка

    public RatePerHour(String name, int tax, double hourRate, int numberHours) {
        super(name);
        this.hourRate = hourRate;
        this.numberHours = numberHours;
        this.tax = tax;
    }

    public double salary() {
        return hourRate * numberHours;
    }
    public double salaryTax() {
        return (salary() * this.tax)/100;
    }
}
