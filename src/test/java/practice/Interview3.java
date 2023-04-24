package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Interview3 {
    public static void main(String[] args) {
        System.out.println(secondMax1(new int[]{1, 9, 3, 4, 6, 7}));
        System.out.println(secondMax2(new int[]{1, 9, 3, 4, 6, 7}));
        System.out.println(secondMax3(new int[]{1, 9, 3, 4, 6, 7}));
        evenAndOddNumber(new int[]{9 , 4, 6 });
    }

    //TODO FIND SECOND MAX IN ARRAY
    //TODO 1.WAY
    public static int secondMax1(int[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    //TODO 2.WAY
    public static int secondMax2(int[] array) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int integer : array) set.add(integer);
        ArrayList<Integer> list = new ArrayList<>((set));
        return list.get(list.size() - 2);
    }

    //TODO 3.WAY
    public static int secondMax3(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) max = i;
        }
        for (int i : array) {
            if (i != max && i > secondMax) secondMax = i;
        }
        return secondMax;
    }

    //TODO FIND EVEN ODD NUMBERS

    public static void evenAndOddNumber(int[] array) {
        boolean isEven = false;
        boolean isOdd = false;
        for (int i : array) {
            if (i % 2 == 0) {
                isEven = true;
                System.out.println("Even Numbers " + i);
            } else {
                isOdd = true;
                System.out.println("Odd Numbers" + i);
            }

        }
        if (!isEven) System.out.println("even numbers not found");
        if (!isOdd) System.out.println("odd numbers not found");

    }
}