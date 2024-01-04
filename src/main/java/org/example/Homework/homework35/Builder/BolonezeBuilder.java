package org.example.Homework.homework35.Builder;

public class BolonezeBuilder extends PastaBuilder{
    @Override
    public void BuildPasta() {
        pasta = new Pasta();
        pasta.setType("Лазанья");
        pasta.setSauce("Cоус болоньєзе на основі м'яса та томатів");
        pasta.setFilling("Бешамель-соус");
        pasta.setAddition("Базилік, петрушка або орегано");
    }
}
