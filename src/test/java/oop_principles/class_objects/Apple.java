package oop_principles.class_objects;

public class Apple {

    public String color;
    public String taste;
    public double price;

    public Apple(String color, String taste, double price) {
        this.color = color;
        this.taste = taste;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", taste='" + taste + '\'' +
                ", price=" + price +
                '}';
    }
}
