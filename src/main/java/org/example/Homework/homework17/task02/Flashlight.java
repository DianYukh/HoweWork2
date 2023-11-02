package org.example.Homework.homework17.task02;

public class Flashlight {
    private boolean light;
    private ChinaBattery battery = new ChinaBattery();

    public void on() {
        if (battery.changeCharge()) {
            System.out.println("Ліхтарик увімкнений. Батарейка заряджена на - " + battery.changeCharge() + " %");
        } else {
            System.out.println("Ліхтарик розряджено");
        }

    }

}
