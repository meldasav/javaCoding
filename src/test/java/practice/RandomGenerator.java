package practice;

import java.util.Map;
import java.util.Random;

public class RandomGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int num1 = random.nextInt(20);
        int num2 = random.nextInt(20);
        StringBuilder sb = new StringBuilder();
        for (int i = Math.min(num1,num2); i <= Math.max(num1,num2) ; i++) {
            if(i % 5 != 0) sb.append(i).append(" - ");
        }
        if(sb.length() > 0) System.out.println(sb.substring(0,sb.length()-3));
    }
}
