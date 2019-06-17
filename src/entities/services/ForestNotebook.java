package entities.services;

import entities.animal_entities.Animal;
import entities.animal_entities.Carnivore;
import entities.animal_entities.Herbivore;
import entities.animal_entities.Omnivore;
import entities.plant_entities.Plant;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ForestNotebook {

    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

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

        for (Animal values : animals) {
            if (values.getName().equalsIgnoreCase(animal.getName())) {
                break;
            } else animals.add(animal);
        }

        if (animal instanceof Carnivore) {
            carnivores.add(( Carnivore ) animal);
        } else if (animal instanceof Herbivore) {
            herbivores.add(( Herbivore ) animal);
        } else if (animal instanceof Omnivore) {
            omnivores.add(( Omnivore ) animal);
        }
    }


    public void addPlant(Plant plant) {
        for (Plant values : plants) {
            if (values.getName().equalsIgnoreCase(plant.getName())) {
                break;
            } else {
                plants.add(plant);
            }
        }
    }

    public void printNotebook() {

        System.out.println("List of Animals");
        System.out.println("-".repeat(40));
        Stream.of(animals).forEach(System.out::println);
        System.out.println("\nList of Plants");
        System.out.println("-".repeat(40));
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
