package day9;

class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }
}

public class Main1 {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(20,10));
        System.out.println(c.sub(20,10));
    }
}