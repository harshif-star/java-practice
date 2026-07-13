package day9;

class Circle {

    double radius;

    double area() {
        return 3.14 * radius * radius;
    }
}

public class Prob5 {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.radius = 7;

        System.out.println("Area = " + c.area());
    }
}