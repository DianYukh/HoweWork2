package org.example.Homework.homework17.task01;

public class Flashlight {
    private boolean light;

    public void on() {
        if (!light) {
            light = true;

        }System.out.println("Ліхтарик увімкнений");
    }

    public void off() {
        if (light) {
            light = false;

        } System.out.println("Ліхтарик вимкнений");
    }

    public boolean isLight() {
        return light;
    }

}
