package practice;

import java.time.LocalDate;
import java.util.Scanner;

public class CurrentAge {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter your birth year: ");
            int birthYear = input.nextInt();

            LocalDate currentDate = LocalDate.now();
            int currentYear = currentDate.getYear();

            int age = currentYear - birthYear;
            System.out.println("Your age is " + age + " years old.");
        }
    }


