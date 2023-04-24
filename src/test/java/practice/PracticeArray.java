package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PracticeArray {
    public static void main(String[] args) {
        System.out.println(isAnagram("automation","automation"));
        duplicates("automation");
        printDuplicate("automation");

        System.out.println(Arrays.toString(shiftLeftArray(new int[]{1, 2, 3, 4})));
        int[] array = {1, 2, 3, 4};
        int lastNumber = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];

        }
        array[0] = lastNumber;
        System.out.println(Arrays.toString(array));

    }

    public static int[] shiftLeftArray(int[] array) {
        int lastNumber = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastNumber;
        return array;
    }

    public static void duplicates(String map) {
        char[] character = map.toCharArray();
        Map<Character, Integer> map1 = new HashMap<>();
        for (Character c : character) {
            if (map1.containsKey(c)) map1.put(c, map1.get(c) + 1);
            else map1.put(c, 1);
        }
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }


    String word = "automation";

    public static void printDuplicate(String word){
        char[] array = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for(Character c : array){
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        for (Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }
    }
    public static boolean isAnagram(String s1 , String s2){
        if(s1.length()!= s2.length())return false;
        else{
            char[] c1 =s1.toLowerCase().toCharArray();
            char[] c2 =s2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
        }
    }






























}
