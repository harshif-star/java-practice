package day9;

class Student {

    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class Prob2 {

    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Harsh";
        s.age = 20;

        s.display();
    }
}