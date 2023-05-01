package practice;

import java.util.HashMap;
import java.util.Map;

public class MostRepeatedElement {

    public static void main(String[] args) {

        int[] numbers = {3, 3, 1, 2, 3, 4, 5, 6, 4, 4, 4, 4};

        int mostRepeated = Integer.MIN_VALUE; // -2,147,483,648
        int mostRepeatedTime = Integer.MIN_VALUE; // -2,147,483,648

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : numbers) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        System.out.println(map);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > mostRepeatedTime) {
                mostRepeatedTime = value;
                mostRepeated = key;
            }

        }
        System.out.println("Most repeated element is " + mostRepeated + " repeated " + mostRepeatedTime + " times.");


        String words = "Automation".toLowerCase();

        Map<Character, Integer> map1 = new HashMap<>();

        for (char c : words.toCharArray()) {
            if (map1.containsKey(c)) map1.put(c, map1.get(c) + 1);
            else map1.put(c, 1);
        }
        System.out.println(map1);

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}