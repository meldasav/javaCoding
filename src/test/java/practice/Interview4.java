package practice;

import java.util.Arrays;

public class Interview4 {

    public static void main(String[] args) {

        int[] array = {19, 23, 45, 28, 45, 58};
        Arrays.sort(array);
        int sum = 0;
        for (int i = array.length - 1; i >= 2; i--) {
            sum += array[i];
        }
        System.out.println(sum);


        //  TODO most frequent element

        int[] array1 = {1, 3, 2, 1, 4, 1};

        int element = 0;
        int count = 0;

        for (int i = 0; i < array1.length; i++) {
            int tempElement = array1[i];
            int tempCount = 0;
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] == tempElement) {
                    tempCount++;
                }
                if (tempCount > count) {
                    element = tempElement;
                    count=tempCount;
                }

            }

        }
        System.out.println("Most counted element is " + element + " most counted times " + count);



    }
}
