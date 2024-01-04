package org.example.Homework.homework35.Builder;

public class CarbonaraBuilder extends PastaBuilder{
    @Override
    public void BuildPasta() {
        pasta = new Pasta();
        pasta.setType("Спагетті");
        pasta.setSauce("Соус Карбонара на яєчних жовтках");
        pasta.setFilling("Бекон або гуанчиале або панчетта");
        pasta.setAddition("Свіжі трави та часник");
    }
}

