package entities.animal_entities;

public class Carnivore extends Animal {

    private double maxFoodSize;

    public Carnivore(String name) {
        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return String.format("Carnivore maxFoodSize = %-6s name = %-6s weight = %skg height = %smeters length = %smeters%n"
                , maxFoodSize, name, weight, height, length);
    }
}
