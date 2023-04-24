package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        String[] words = {"abc","bar","foo"};
        ArrayList<String> reversed = new ArrayList<>();
        for (int i = words.length-1; i >=0 ; i--) {
            reversed.add(words[i]);
        }
        System.out.println((Arrays.toString(reversed.toArray())));
    }
}
