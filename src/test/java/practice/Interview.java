package practice;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word=scan.next();
        System.out.println(palindrome(word));

    }

    public static boolean palindrome(String word) {
        StringBuilder reversed = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed.append(word.charAt(i));

        }
        return reversed.toString().equals(word);
    }


}


