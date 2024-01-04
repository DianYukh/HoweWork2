package org.example.Homework.homework35.Builder;

class Pasta {
    protected String type;
    protected String sauce;
    protected String filling;
    protected String addition;

public Pasta(){

}

    public void setType(String type) {
        this.type = type;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public String getType() {
        return type;
    }

    public String getSauce() {
        return sauce;
    }

    public String getFilling() {
        return filling;
    }

    public String getAddition() {
        return addition;
    }

    public void Show() {
        System.out.println("Тип пасти: " + type);
        System.out.println("Соус: " + sauce);
        System.out.println("Начинка: " + filling);
        System.out.println("Доповнення: " + addition);
    }
}
