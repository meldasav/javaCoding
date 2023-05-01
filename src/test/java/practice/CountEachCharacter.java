package practice;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacter {

    public static void main(String[] args) {

        dup( new int[] {1, 2, 3, 1, 2, 3, 4, 5});

        String sentence = "Chicago is a nice city".toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for (Character c : sentence.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) System.out.println(entry.getKey());
        }


        int[] array = {1, 2, 3, 1, 2, 3, 4, 5};
        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i : array) {
            if (map1.containsKey(i)) map1.put(i, map1.get(i) + 1);
            else map1.put(i, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == 1) System.out.println(entry.getKey());
        }
    }

    public static void dup(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : numbers) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

    }
}