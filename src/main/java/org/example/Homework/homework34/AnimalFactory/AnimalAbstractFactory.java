package org.example.Homework.homework34.AnimalFactory;

public class AnimalAbstractFactory {
    Animal animal;

    public Animal createAnimal(AnimalType type) {
        Animal animal = null;

        switch (type) {
            case LAND:
                animal = new LandAnimal();
                break;
            case SEA:
                animal = new SeaAnimal();
                break;
            case AIR:
                animal = new SkyAnimal();
                break;
            default:
                System.out.println("Invalid animal type");
        }
        return animal;
    }
        AnimalEra getFromConfiguration() {
        return AnimalEra.MESOZOIC; // Default configuration
    }
}
