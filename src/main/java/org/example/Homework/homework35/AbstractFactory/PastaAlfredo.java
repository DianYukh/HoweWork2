package org.example.Homework.homework35.AbstractFactory;

public class PastaAlfredo implements Pasta{
    @Override
    public String type() {
        return "Фетучини";
    }

    @Override
    public String sauce() {
        return "Соус Альфредо на основі вершків, сиру Пармезан";
    }

    @Override
    public String filling() {
        return "Куряче м'ясо або гриби";
    }

    @Override
    public String addition() {
        return "Свіжі трави";
    }
}
