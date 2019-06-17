package entities.animal_entities;

import entities.plant_entities.Plant;

import java.util.LinkedHashSet;
import java.util.Set;

public class Herbivore extends Animal {

    Set<Plant> plantDiet = new LinkedHashSet<>();

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    public void printDiet() {

    }

    @Override
    public String toString() {
        return String.format("Herbivore :plantDiet = %s name = %-6s weight = %-6skg height = %smeters length = %smeters%n"
                , plantDiet, name, weight, height, length);
    }
}
