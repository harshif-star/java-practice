package day9;

class Student {

    String name = "Harsh";
    int age = 20;
}

public class Prob1 {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
    }
}