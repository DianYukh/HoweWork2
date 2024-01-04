package org.example.Homework.homework35.Builder;

public class AlfredoBuilder extends PastaBuilder {

    @Override
    public void BuildPasta() {
        pasta = new Pasta();
        pasta.setType("Фетучини");
        pasta.setSauce("Соус Альфредо на основі вершків, сиру Пармезан");
        pasta.setFilling("Куряче м'ясо або гриби");
        pasta.setAddition("Свіжі трави");
    }
}
