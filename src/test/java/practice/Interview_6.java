package practice;

import java.util.Scanner;

public class Interview_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter your word");
        String csword=sc.next();
        System.out.println(isPalidrome(csword));

    }
    public static boolean isPalidrome(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        return str.equals(reverse);
    }
}
