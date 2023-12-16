package org.example.Homework.homework34.AnimalFactory;

public class Run {
    public static void main(String[] args) {
        AnimalAbstractFactory animalFactory = new AnimalAbstractFactory();
        Animal landAnimal = animalFactory.createAnimal(AnimalType.LAND);
        if (landAnimal != null) {

            landAnimal.makeSound();
        } else {
            System.out.println("Failed to create land animal");
        }
    }
}
