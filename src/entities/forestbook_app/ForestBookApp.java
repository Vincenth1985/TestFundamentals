package entities.forestbook_app;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.*;
import entities.services.ForestNotebook;

import java.util.stream.Stream;

public class ForestBookApp {

    public static void main(String[] args) {

        ForestNotebook forestNotebook = new ForestNotebook();

        Plant tree = new Tree("Laurus nobilis", 7);
        Plant flower = new Flower("Aconites", 0.02);
        Plant flower2 = new Flower("Allium", 1.80);
        Plant weed = new Weed("Cannabis", 0.06);
        Plant bush = new Bush("Shrubs", 2);

        //Adding plant to a list.
        forestNotebook.addPlant(tree);
        forestNotebook.addPlant(flower);
        forestNotebook.addPlant(flower2);
        forestNotebook.addPlant(weed);
        forestNotebook.addPlant(bush);

        //Making animals from different type.
        Carnivore lion = new Carnivore("Lion", 190, 1.2, 2);
        Carnivore wolf = new Carnivore("Wolf", 80, 60, 1.50);
        Carnivore crocodile = new Carnivore("Crocodil", 500, 0.50, 3);

        Herbivore cow = new Herbivore("Cow", 1100, 1.80, 2.5);
        Herbivore horse = new Herbivore("Horse", 600, 1.6, 2.4);
        Herbivore rhinoceros = new Herbivore("Rhinoceros", 2000, 2, 3);
        //Adding plant to a list
        cow.addPlantToDiet(bush);
        horse.addPlantToDiet(bush);
        rhinoceros.addPlantToDiet(bush);

        Omnivore bear = new Omnivore("Bear", 450, 2, 2.3);
        Omnivore dog = new Omnivore("Dog", 4, 1, 1);
        Omnivore eagle = new Omnivore("Eagle", 4, 0.5, 10);

        forestNotebook.addAnimal(lion);
        forestNotebook.addAnimal(lion);
        forestNotebook.addAnimal(crocodile);
        forestNotebook.addAnimal(cow);
        forestNotebook.addAnimal(horse);
        forestNotebook.addAnimal(rhinoceros);
        forestNotebook.addAnimal(bear);
        forestNotebook.addAnimal(dog);
        forestNotebook.addAnimal(eagle);


        System.out.println("Count van Animals en Plants");
        System.out.println("-".repeat(40));
        System.out.println(forestNotebook.getAnimalCount());
        System.out.println(forestNotebook.getPlantCount());

        System.out.println("\nList of Animals and Plants not sorted");
        System.out.println("-".repeat(40));
        forestNotebook.printNotebook();

        System.out.println("\nList of Animals");
        System.out.println("-".repeat(40));
        Stream.of(forestNotebook.getCarnivores()).forEach(System.out::println);
        Stream.of(forestNotebook.getHerbivores()).forEach(System.out::println);
        Stream.of(forestNotebook.getOmnivores()).forEach(System.out::println);


        //Sorting by name.
        forestNotebook.sortAnimalsByName();
        forestNotebook.sortPlantsByName();

        System.out.println("\nList of Animals and Plants sorted");
        System.out.println("-".repeat(40));
        forestNotebook.printNotebook();


    }
}
