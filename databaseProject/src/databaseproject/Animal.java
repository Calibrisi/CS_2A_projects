package databaseproject;

public class Animal {
    private String name;
    private String species;
    private int age;
    private int weight;
    private int height;

    public Animal(String name, String species, int age, int weight, int height) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public String toString() {
        return name + " " + species;
    }
    
    
}