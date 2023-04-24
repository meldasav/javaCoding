package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Interview_5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(duplicateElement(new int[]{1, 1, 2, 3, 4, 5})));
        primeNumber(3);
        System.out.println(missingNumber((new int[]{1,2,4,5})));//12 //15

    }

    public static int[] duplicateElement(int[] array) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : array) list.add(i);
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    list1.add(list.get(i));
                }
            }
        }

        int[] array1 = new int[list1.size()];
        for (int k = 0; k < list1.size(); k++) {
            array1[k] += list1.get(k);
        }
        return array1;

    }

    public static void primeNumber(int number) {

        int count = 0;
        if (number > 1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) count++;
            }
            if (count == 2) System.out.println("Number is prime");
            else System.out.println("number is not prime");
        } else {
            System.out.println("is not prime");
        }
    }

    public static int missingNumber(int[] array) {
        int sumWithoutMissing = 0;
        for (int i = 0; i < array.length; i++) {
            sumWithoutMissing += array[i];
        }
        int currentSum = 0;
        for (int i : array) {
            currentSum += i;
        }
        return sumWithoutMissing - currentSum;
    }
}


