package practice;

import java.util.Scanner;

public class PracticeScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scanner.next();
        System.out.println(isPalindrome2(word));
    }

    public static boolean isPalindrome(String word){
        String reversed = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reversed +=word.charAt(i);
        }
        return word.equals(reversed);
    }
    public static boolean isPalindrome1(String word){
        return new StringBuilder(word).reverse().toString().equals(word);
    }
    public static boolean isPalindrome2(String word){
        StringBuilder sb = new StringBuilder();
        for (int i = word.length()-1; i >=0 ; i--) {
            sb.append(word.charAt(i));
        }
        return sb.toString().equals(word);
    }
}
