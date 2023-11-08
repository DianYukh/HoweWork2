package org.example.Homework.homework17.task02.v2;

import java.time.LocalTime;

public abstract class ChinaBattery implements Battery {
    private int charge;
    public ChinaBattery(){
        this.charge = 100; // значення для батереї
    }
    public boolean changeCharge() {

        if (charge > 0) {
            charge--;
            return true;
        } else {
            return false;
        }
    }
    public int getCharge() {
        return charge;
    }

}
