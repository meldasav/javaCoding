package practice;

public class FirstPositiveAndNegative {

    public static void main(String[] args) {

        int[] array = {3, 4, 6, -9, 10};

        int firstPositive = Integer.MAX_VALUE;
        int firstNegative = Integer.MIN_VALUE;

        for (int number : array) {
            if (number > 0 && firstPositive == Integer.MAX_VALUE) {
                firstPositive = number;
            } else if (number < 0 && firstNegative == Integer.MIN_VALUE) {
                firstNegative = number;
            }
            if (firstPositive != Integer.MAX_VALUE && firstNegative != Integer.MIN_VALUE) {
                break;
            }
        }
        System.out.println(firstPositive);
        System.out.println(firstNegative);


        int firstOdd = -1;
        int firstEven = -1;

        for (int num : array){
            if(num % 2 == 0 && firstEven == -1){
                firstEven = num;
            }else if(num % 2 == 1 && firstOdd == -1){
                firstOdd = num;
            }
            if(firstEven != -1 && firstOdd != -1){
              break;
            }
        }
        System.out.println(firstEven);
        System.out.println(firstOdd);
    }
}