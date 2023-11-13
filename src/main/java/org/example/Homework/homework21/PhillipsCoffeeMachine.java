package org.example.Homework.homework21;

public class PhillipsCoffeeMachine extends CoffeeMachine{
    public static int maxCoffeeLevel = 1000;
    public static int maxWaterLevel = 700;
    public PhillipsCoffeeMachine() {

    }
    public PhillipsCoffeeMachine(int currentWaterLevel, int currentCoffeeLevel, int currentGarbageLevel) {
        super(currentWaterLevel, currentCoffeeLevel, currentGarbageLevel);
    }

    @Override
    public void addWater() {
    }
    @Override
    public void addCoffee() {
    }
}
