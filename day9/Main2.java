package day9;

class Car {

    String brand;
    String color;

    void display() {

        System.out.println(brand);
        System.out.println(color);
    }
}

public class Main2 {

    public static void main(String[] args) {

        Car c = new Car();

        c.brand = "BMW";
        c.color = "Black";

        c.display();
    }
}