package org.example.Homework.homework21;

public abstract class CoffeeMachine implements ICoffeeMachine {
    private int maxWaterLevel;
    private int maxCoffeeLevel;
    private int maxGarbageLevel;

    private int currentWaterLevel;
    private int currentCoffeeLevel;
    private int currentGarbageLevel;

    protected CoffeeMachine() {
    }

    public boolean checkWaterLevel(int currentWaterLevel) {
        return this.currentWaterLevel > 0;
    }

    public boolean checkCoffeeLevel(int currentCoffeeLevel) {
        return currentCoffeeLevel > 0;
    }

    public boolean checkGarbageLevel() {
        return currentGarbageLevel > 0;
    }


    public CoffeeMachine(int maxWaterLevel, int maxCoffeeLevel, int maxGarbageLevel, int currentWaterLevel, int currentCoffeeLevel, int currentGarbageLevel) {
        this.maxWaterLevel = maxWaterLevel;
        this.maxCoffeeLevel = maxCoffeeLevel;
        this.maxGarbageLevel = maxGarbageLevel;
        this.currentWaterLevel = currentWaterLevel;
        this.currentCoffeeLevel = currentCoffeeLevel;
        this.currentGarbageLevel = currentGarbageLevel;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }


    //еспресо — 22 г. меленої кави та 30 мл. води
    @Override
    public void makeEspresso() {
        if(!checkWaterLevel(currentWaterLevel)) {
            System.out.println("Відсутня вода");
        }
        if(!checkCoffeeLevel(currentCoffeeLevel)) {
            System.out.println("Відсутня кава");
        }
        currentCoffeeLevel -= 22;
        currentWaterLevel -= 30;
    }

    //американо — 22 г. меленої кави та 100 мл. води
    @Override
    public void makeAmericano() {
        if(!checkWaterLevel(currentWaterLevel)) {
            System.out.println("Відсутня вода");
        }
        if(!checkCoffeeLevel(currentCoffeeLevel)) {
            System.out.println("Відсутня кава");
        }
        currentCoffeeLevel -= 22;
        currentWaterLevel -= 100;
    }

    @Override
    public void cleanGarbageBox() {

    }
}
