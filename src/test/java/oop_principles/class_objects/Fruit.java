package oop_principles.class_objects;

public class Fruit {

    public static boolean hasColor;

    static {
        hasColor = true;
    }
    public boolean isSweet;
    public String name;
    public String shape;

    {
        shape = "Round";
        isSweet = true;
    }

    public static void main(String[] args) {
        Fruit apple = new Fruit();
        System.out.println(apple.isSweet);
        System.out.println(apple.shape);
        System.out.println(Fruit.hasColor);
    }
}
