package org.example.Homework.homework35.AbstractFactory;

public class PastaBoloneze implements Pasta {
    @Override
    public String type() {
        return "Лазанья";
    }

    @Override
    public String sauce() {
        return "Cоус болоньєзе на основі м'яса та томатів";
    }

    @Override
    public String filling() {
        return "Бешамель-соус";
    }

    @Override
    public String addition() {
        return "Базилік, петрушка або орегано";
    }
}
