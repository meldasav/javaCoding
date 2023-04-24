package practice;

import java.util.HashMap;
import java.util.Map;

public class JavaPractice {
    public static void main(String[] args) {
        primeNumber(7);

        String word = "automation".toLowerCase();
        StringBuilder sb = new StringBuilder();
        char[] c = word.toCharArray();

        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (!sb.toString().contains(c[i] + "") && (c[i] + "").equals(c[j] + "")) {
                    sb.append(c[i]);
                    System.out.println(c[i]);

                }
            }
        }
        System.out.println(sb);

        Map<String, Double> materials = new HashMap<>();
        materials.put("Pen", 5.99);
        materials.put("Book", 20.99);
        materials.put("NoteBook", 20.98);
        materials.put("Pencil", 9.99);

        System.out.println(mostExpensive(materials));
        System.out.println(leastExpensive(materials));

        Map<String, Integer> inventory = new HashMap<>();
        inventory.put("Mercedes", 10);
        inventory.put("Audi", 25);
        inventory.put("Tesla", 5);
        inventory.put("BMW", 26);
        System.out.println(mostCountedCar(inventory));

        Map<String, Integer> products = new HashMap<>();
        products.put("Apple", 3);
        products.put("Egg", 20);
        products.put("Eggplant", 2);
        products.put("Melon", 1);
        System.out.println(leastNeededProduct(products));

        Map<String, Integer> people = new HashMap<>();
        people.put("John", 45);
        people.put("Jane", 25);
        people.put("Alex", 18);
        people.put("Max", 29);
        System.out.println(youngestPerson(people));
    }


    public static void primeNumber(int number) {
        int count = 0;
        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) count++;
            }
            if (count == 2) System.out.println("it is a prime number");
            else System.out.println("it is not a prime number");
        } else {
            System.out.println("it is not a prime number");
        }
    }

    public static String mostExpensive(Map<String, Double> material) {

        String mostExpensiveProduct = "";
        double mostExpensivePrice = Double.MIN_VALUE;

        for (Map.Entry<String, Double> entry : material.entrySet()) {
            String productName = entry.getKey();
            Double productPrice = entry.getValue();

            if (productPrice > mostExpensivePrice) {
                mostExpensivePrice = productPrice;
                mostExpensiveProduct = productName;
            }
        }
        return mostExpensiveProduct + " is the most expensive and the price is $ " + mostExpensivePrice + ".";
    }

    public static String leastExpensive(Map<String, Double> products) {
        String leastExpensive = "";
        double leastExpensivePrice = Double.MAX_VALUE;

        for (Map.Entry<String, Double> entry : products.entrySet()) {
            String productName = entry.getKey();
            double productPrice = entry.getValue();

            if (productPrice < leastExpensivePrice) {
                leastExpensivePrice = productPrice;
                leastExpensive = productName;
            }
        }
        return leastExpensive + " is the least expensive and the price is $ " + leastExpensivePrice + ".";
    }

    public static String mostCountedCar(Map<String, Integer> inventory) {
        String mostCountedCar = "";
        int mostCounted = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            String car = entry.getKey();
            int count = entry.getValue();

            if (count > mostCounted) {
                mostCounted = count;
                mostCountedCar = car;
            }
        }
        return mostCountedCar + " is the most counted car in the inventory and quantity is " + mostCounted + ".";
    }

    public static String leastNeededProduct(Map<String, Integer> products) {
        String leastNeeded = "";
        int leastCount = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            String productName = entry.getKey();
            int productCount = entry.getValue();

            if (productCount < leastCount) {
                leastCount = productCount;
                leastNeeded = productName;
            }
        }
        return leastNeeded + " is the least needed product and quantity is " + leastCount + ".";
    }

    public static String youngestPerson(Map<String, Integer> people) {
        String youngestName = "";
        int youngestAge = Integer.MAX_VALUE;

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String name = entry.getKey();
            int age = entry.getValue();

            if (age < youngestAge) {
                youngestAge = age;
                youngestName = name;
            }
        }
        return youngestName + " is the youngest person and age is " + youngestAge + ".";
    }

}