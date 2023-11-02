package org.example.Homework.homework16.task02;

public class RatePerHour extends Workers {
    double hourRate;
    int numberHours;
    String paymentMethod;
    String tax; // Cтавка

    public RatePerHour(String name, String tax, double hourRate, int numberHours) {
        super(name);
        this.hourRate = hourRate;
        this.numberHours = numberHours;
    }

    public double salary() {
        return hourRate * numberHours;
    }
    public double salaryTax() {
        return salary() * 0.20;
    }
}
