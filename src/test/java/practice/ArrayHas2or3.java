package practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHas2or3 {
    public static void main(String[] args) {
        arrayHas2or3_(new int[]{1, 2, 4, 5, 6});

        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();

        for (int i = Math.max(num1, num2); i >= Math.min(num1, num2); i--) {
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
}
