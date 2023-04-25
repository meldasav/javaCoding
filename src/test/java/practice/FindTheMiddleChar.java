package practice;

import java.util.Scanner;

public class FindTheMiddleChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        if (name.length() % 2 == 0) {
            System.out.println(" " + name.charAt(name.length() / 2 - 1) + name.charAt(name.length() / 2));
        } else {
            System.out.println(name.charAt(name.length() / 2));


            }
        }

    }

