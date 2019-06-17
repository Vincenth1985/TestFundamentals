package entities.services;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.Plant;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ForestNotebook {

    private List<Carnivore> carnivores = new LinkedList<>();
    private List<Omnivore> omnivores = new LinkedList<>();
    private List<Herbivore> herbivores = new LinkedList<>();
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new LinkedList<>();
    private List<Plant> plants = new LinkedList<>();

    public ForestNotebook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {

        return plantCount = Stream.of(plants).mapToInt(Plant -> plants.size()).sum();

    }

    public int getAnimalCount() {
        return animalCount = Stream.of(animals).mapToInt(Animal -> animals.size()).sum();

    }

    public void addAnimal(Animal animal) {

        animals.add(animal);
        this.animals = animals.stream().distinct().collect(Collectors.toList());

        for (Animal animal1 : animals) {
            if (animal instanceof Carnivore) {
                carnivores.add(( Carnivore ) animal);
                break;
            } else if (animal instanceof Herbivore) {
                herbivores.add(( Herbivore ) animal);
                break;
            } else if (animal instanceof Omnivore) {
                omnivores.add(( Omnivore ) animal);
                break;
            }
        }


    }


    public void addPlant(Plant plant) {
        plants.add(plant);
        plants.add(plant);
        this.plants = plants.stream().distinct().collect(Collectors.toList());
    }

    public void printNotebook() {
        System.out.println("Printing Animals");
        System.out.println("*".repeat(20));
        Stream.of(animals).forEach(System.out::println);
        System.out.println();
        System.out.println("Printing Plants");
        System.out.println("*".repeat(20));
        Stream.of(plants).forEach(System.out::println);

    }

    public void sortAnimalsByName() {

        animals.sort(Comparator.comparing(animal -> animal.getName()));

    }

    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(plant -> plant.getName()));


    }

    public void sortAnimalByHeight() {
        animals.sort(Comparator.comparing(animal -> animal.getHeight()));

    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(plant -> plant.getHeight()));

    }

}
