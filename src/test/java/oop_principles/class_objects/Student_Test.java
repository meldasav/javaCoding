package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Arrays;

public class Student_Test {
    public static void main(String[] args) {
        Student student1 = new Student("Melda", "Sav", 1983, "female", "White Oak Drive", "melda@gmail.com", 1234, 39, 150.0, 5.6);
        Student student2 = new Student("Kerem", "Gulsever", 2007, "male", "White Oak Drive", "kerem@gmail.com", 1238, 16, 155.0, 6.11);
        Student student3 = new Student("Tarik", "Gul", 1976, "male", "White Oak Drive", "tarik@gmail.com", 1240, 45, 187.0, 6.9);

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3));
        for (Student s : students) {
            if (s.firstName.startsWith("M")) {
                System.out.println(s.firstName);
            }
            System.out.println();
        }

        for(Student s : students){
            if(s.id > 1238){
                System.out.println(s.firstName);
            }
        }
    }
}