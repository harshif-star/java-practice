package day9;

class Bank {

    String name;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void display() {
        System.out.println(balance);
    }
}

public class Prob6 {

    public static void main(String[] args) {

        Bank b = new Bank();

        b.name = "Harsh";

        b.deposit(5000);

        b.display();
    }
}
