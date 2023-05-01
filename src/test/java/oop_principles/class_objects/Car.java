package oop_principles.class_objects;

public class Car {

    public String make;
    public String model;
    public int year;
    public String color;

    public Car(String make,String model,int year , String color){
        this.make = make;
        this.model= model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
