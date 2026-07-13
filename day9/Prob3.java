package day9;

class Employee {

    int id;
    String name;
    double salary;

    void display() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }
}

public class Prob3 {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.id = 101;
        e.name = "Rahul";
        e.salary = 25000;

        e.display();
    }
}