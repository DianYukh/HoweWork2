package org.example.Homework.homework34.AnimalFactory;

public class SkyAnimal extends Animal {

    SkyAnimal(AnimalType type, AnimalEra era, String name) {
        super(type, era, name);
    }

    public SkyAnimal() {

    }

    @Override
    void create() {

    }

    @Override
    public void makeSound() {
        System.out.println("Sky animal sound");
    }
}
