package org.example.Homework.homework34.AnimalFactory;

public abstract class Animal {
    AnimalType type;
    AnimalEra era;
    String name;

    Animal(AnimalType type, AnimalEra era, String name) {
        this.type = type;
        this.era = era;
        this.name = name;
    }

    public Animal() {

    }

    abstract void create();

    public abstract void makeSound();
}
