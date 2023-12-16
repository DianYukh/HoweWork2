package org.example.Homework.homework34.AnimalFactory;

public class LandAnimal extends Animal{
    LandAnimal(AnimalType type, AnimalEra era, String name) {
        super(type, era, name);
    }

    public LandAnimal() {
        super();
    }

    @Override
    void create() {
    }
    @Override
    public void makeSound() {
        System.out.println("Land animal sound");
    }
}
