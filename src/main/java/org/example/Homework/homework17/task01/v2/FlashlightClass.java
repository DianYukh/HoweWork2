package org.example.Homework.homework17.task01.v2;

public class FlashlightClass implements Flashlight {
private boolean light;

    public FlashlightClass() {
    }


    @Override
    public void on(){
        light=true;
        System.out.println("Ліхтарик увімкнений");
    }
    @Override
    public void off(){
        light=false;
        System.out.println("Ліхтарик вимкнений");
    }
    @Override
    public boolean isLight(){
        return light;
    }
}
