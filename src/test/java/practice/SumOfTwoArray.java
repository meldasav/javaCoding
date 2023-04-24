package practice;

import java.util.Arrays;

public class SumOfTwoArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfTwo(new int[]{1, 2, 3,}, new int[]{1, 2, 3, 4})));
    }
    public static int[] sumOfTwo(int[] a1 , int[] a2){
        for (int i = 0; i < Math.min(a1.length,a2.length); i++) {
            if(a1.length > a2.length) a1[i]+=a2[i];
            else a2[i]+=a1[i];
        }
        return a1.length > a2.length ? a1 : a2 ;
    }
}
