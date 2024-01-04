package org.example.Homework.homework35.AbstractFactory;

public class PastaCarbonara implements Pasta{
    @Override
    public String type() {
        return "Спагетті";
    }

    @Override
    public String sauce() {
        return "Соус Карбонара на яєчних жовтках";
    }

    @Override
    public String filling() {
        return "Бекон або гуанчиале або панчетта";
    }

    @Override
    public String addition() {
        return "Свіжі трави та часник";
    }


}
