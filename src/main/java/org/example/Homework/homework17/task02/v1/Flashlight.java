package org.example.Homework.homework17.task02.v1;

public class Flashlight {
    private boolean light;
    private final ChinaBattery battery = new ChinaBattery();

    public void on() {
        if (battery.changeCharge()) {
            System.out.println("Ліхтарик увімкнений. Батарейка заряджена на - " + battery.getCharge() + " %");
        } else {
            System.out.println("Ліхтарик розряджено");
        }

    }

}
