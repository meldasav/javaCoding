package practice;

import java.util.Arrays;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10, b = 20;
        int temp = b;

        b = a;
        a = temp;

        System.out.println(b);
        System.out.println(a);

        int[] numbers = {a, b};
        int tempt = numbers[1];
        numbers[1] = numbers[0];
        numbers[0] = tempt;
        System.out.println(Arrays.toString(numbers));


        int number = 1234;

//        int rev = 0;
//        while(number!=0){
//
//            rev = rev*10 + number%10;
//            number = number/10;
//        }
//        System.out.println(rev);

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.append(number).reverse());

        int num1 =16461;
        StringBuilder sb1 = new StringBuilder();
        int num2 = Integer.parseInt(String.valueOf(sb1.append(num1).reverse()));
        System.out.println((num1 + " ").equals(num2 + " "));

        int number1=5;
        int n1=0,n2=1,n3;
        StringBuilder sb3 = new StringBuilder();
        for (int i = 0; i < number1; i++) {
            sb3.append(n1).append("-");
            n3=n1+n2;
            n1=n2;
            n2=n3;
        }
        System.out.println(sb3.substring(0,sb3.length()-1));
        String word1 = "table";
        String word2 = "elbat";
        System.out.println(arrayEquals(word1,word2));

    }
     public static boolean arrayEquals(String array1 , String array2){
        char[] c1 = array1.toCharArray();
        char[] c2 = array2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
     }



}