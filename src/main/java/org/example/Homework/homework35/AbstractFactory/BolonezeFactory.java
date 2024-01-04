package org.example.Homework.homework35.AbstractFactory;

public class BolonezeFactory implements PastaFactory{
    @Override
    public Pasta createPasta() {
        return new PastaBoloneze();
    }
}
