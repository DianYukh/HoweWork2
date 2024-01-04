package org.example.Homework.homework35.AbstractFactory;

public class CarbonaraFacrory implements PastaFactory {
    @Override
    public Pasta createPasta() {
        return new PastaCarbonara();
    }
}
