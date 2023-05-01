package oop_principles.class_objects;

public class Student {

    public String firstName;
    public String lastName;
    public int dateOfBirth;
    public String gender;
    public String address;
    public String email;
    public double weight;
    public double height;
    public int id;
    public int age;

    public Student(String firstName, String lastName, int dateOfBirth, String gender, String address, String email, int id, int age, double weight, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.height = height;

    }

    public void study() {
        System.out.println("Students study");
    }

    public void eat() {
        System.out.println("Students eat");
    }

    public void sleep() {
        System.out.println("Students sleep");
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}
