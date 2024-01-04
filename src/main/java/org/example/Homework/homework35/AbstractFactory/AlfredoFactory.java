package org.example.Homework.homework35.AbstractFactory;

public class AlfredoFactory implements PastaFactory {
    @Override
    public Pasta createPasta() {
        return new PastaAlfredo();
    }
}
