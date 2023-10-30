package org.example.Homework.homework15.task03;

public class Money {
    private long hrivnia;
    private byte kopiyka;

    public Money() {
    }

    public Money(long hrivnia, byte kopiyka) {
        kopiyka = (byte) Math.abs(kopiyka);
        hrivnia = Math.abs(hrivnia);
        if (kopiyka >= 100) {
            hrivnia++;
            kopiyka -= 100;
        }
        this.hrivnia = hrivnia;
        this.kopiyka = kopiyka;
    }


    public void add(long hrivnia, byte kopiyka) {
        int temp = this.kopiyka;
        this.hrivnia += hrivnia;
        temp += kopiyka;
        if (temp > 100) {
            this.hrivnia += 1;
            temp -= 100;
            this.kopiyka = (byte) temp;
        }
        System.out.println("Додавання");
    }

    public void subtraction(long hrivnia, byte kopiyka) {
        int temp = this.kopiyka;
        this.hrivnia -= hrivnia;
        temp -= kopiyka;
        if (temp < 0) {
            this.hrivnia -= 1;
            temp += 100;
        }
        this.kopiyka = (byte) temp;
        System.out.println("Віднімання");
    }

    public void division(int digit) {
        double temp = this.kopiyka;
        double hrivnia = this.hrivnia;
        double temp2;
        double temp3;
        hrivnia = hrivnia / digit;
        temp2 = Math.round(hrivnia);
        temp3 = kopiyka / digit;
        temp = (temp2 - hrivnia) * 100 + temp3;
        this.kopiyka = (byte) temp;
        this.hrivnia = (long) hrivnia;
        System.out.println("Ділення сум");
    }

    public void equals(long hrivnia, byte kopiyka) {
        double temp = this.hrivnia;
        double temp2 = this.kopiyka;
        if (Double.valueOf(hrivnia).equals(Double.valueOf(temp)) && Double.valueOf(kopiyka).equals(Double.valueOf(temp2))) {
            System.out.println("Числа рівні\n" + hrivnia + "," + kopiyka + " = " + this.hrivnia + "," + this.kopiyka);
        } else {
            System.out.println("Числа не рівні\n" + hrivnia + "," + kopiyka + " != " + this.hrivnia + "," + this.kopiyka);
        }
    }

    /* public void divisonNum(double digitDouble) {
        double temp = this.kopiyka;
        double hrivnia = this.hrivnia;
        double temp2;
        double temp3;
        double temp4;
        temp2 = hrivnia / digitDouble;
        temp4 = Math.round(hrivnia);
        temp3 = (kopiyka / digitDouble)/100;
        temp = (temp2-temp4)*100 + temp3;
        this.kopiyka = (byte) temp4;
        this.hrivnia = (long) temp2;
        System.out.println("Ділення сум на дробове число");
    }
    public void multiplication(double digitDouble) {
       double temp = this.kopiyka;
        double hrivnia = this.hrivnia;
        double temp2;
        double temp3;
        double temp4;
        hrivnia = hrivnia * digitDouble;
        temp2 = Math.round(hrivnia);
        temp3 = (kopiyka * digitDouble)/10;
        temp4 = (temp2-hrivnia);
        temp = temp4+temp3;
        this.kopiyka = (byte) temp;
        this.hrivnia = (long) hrivnia;
        System.out.println("Множення сум на дробове число");
    }*/

    public void show() {
        System.out.println(hrivnia + "," + kopiyka);
    }
}
