package day9;

class Mobile {

    String model;
    int price;

    void display() {

        System.out.println(model);
        System.out.println(price);
    }
}

public class Main4 {

    public static void main(String[] args) {

        Mobile m = new Mobile();

        m.model = "Samsung";
        m.price = 25000;

        m.display();
    }
}