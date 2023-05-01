package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Animal {

    public String name;
    public static final boolean hasEyes = true;
    public int age;
    public String color;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    public Animal(String name, int age, String color, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {
        // assign local variable to instant variable
        this.name = name;
        this.age = age;
        this.color = color;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", isCarnivore=" + isCarnivore +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                '}';
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("dog", 4, "white", false, false, true);
        Animal animal2 = new Animal("cat", 1, "grey", false, false, true);
        Animal animal3 = new Animal("cow", 10, "black", false, true, false);

        List<Animal> animals = new ArrayList<>(Arrays.asList(animal1, animal2, animal3));
        animals.forEach(System.out::println);
        int herbivore = 0;
        int Omnivore = 0;
        int carnivore = 0;
        for (Animal animal : animals) {
            if (animal.isHerbivore) herbivore++;
            else if (animal.isOmnivore) Omnivore++;
            else carnivore++;

        }
        System.out.println(herbivore);
        System.out.println(Omnivore);
        System.out.println(carnivore);
        System.out.println(animals.stream().filter(animal -> animal.isHerbivore).count());
    }

}

