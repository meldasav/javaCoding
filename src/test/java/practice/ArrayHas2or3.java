package practice;

import java.util.*;

public class ArrayHas2or3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6};
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }

        int maxCount = Integer.MIN_VALUE;
        List<Integer> mostRepeated = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                mostRepeated.clear();
                mostRepeated.add(entry.getKey());
            } else if (count == maxCount) {
                mostRepeated.add(entry.getKey());
            }
        }

        System.out.print("Most repeated elements: ");
        for (int num : mostRepeated) {
            System.out.print(num + " ");
        }


        int[] array = {1, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6};

        Map<Integer, Integer> map2 = new HashMap<>();

        int mostReapedCount = Integer.MIN_VALUE;


        for (
                int num : array) {
            if (map2.containsKey(num)) map2.put(num, map2.get(num) + 1);
            else map2.put(num, 1);
        }

        List<Integer> list = new ArrayList<>();
        for (
                Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            if (entry.getValue() > mostReapedCount) {
                mostReapedCount = entry.getValue();
                list.add(entry.getKey());
            } else if (entry.getValue() > 1) {
                list.add(entry.getKey());
            }
        }
        for (
                int n : list) {
            System.out.println(n);
        }


        Map<Integer, Integer> map = new HashMap<>();

        for (
                int num : array) {
            if (map.containsKey(num)) map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        for (
                Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }


        System.out.println(

                arrayHas2or3__(new int[]{
                        1, 2, 4, 5, 6
                }));

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();

        for (
                int i = Math.max(num1, num2);
                i >= Math.min(num1, num2); i--) {
            System.out.println(i);
            if (i < 12) break;
        }

    }



    public static boolean arrayHas2or3(int[] array) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, 2) > 0 || Arrays.binarySearch(array, 3) > 0;
    }

    public static void arrayHas2or3_(int[] array) {
        System.out.println(Arrays.stream(array).filter(num -> num == 2).count());
        System.out.println(Arrays.stream(array).filter(num -> num == 3).count());
    }

    public static boolean arrayHas2or3__(int[] array) {
        for (int num : array) {
            if (num == 2 || num == 3) return true;
        }
        return false;
    }

    public static void has23(int[] array) {
        System.out.println(Arrays.stream(array).filter(num -> num == 2).count());
        System.out.println(Arrays.stream(array).filter(num -> num == 3).count());

    }
}
