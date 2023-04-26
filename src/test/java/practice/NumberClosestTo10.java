package practice;

public class NumberClosestTo10 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 10, 15};

        int leftClosest = Integer.MIN_VALUE;
        int rightClosest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < 10 && num > leftClosest) {
                leftClosest = num;
            } else if (num > 10 && num < rightClosest) {
                rightClosest = num;
            }
        }
        if (10 - leftClosest <= rightClosest - 10) System.out.println(leftClosest);
        else System.out.println(rightClosest);
    }
}
