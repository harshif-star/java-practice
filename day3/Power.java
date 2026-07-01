package day3;
import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base: ");
        int base = sc.nextInt();

        System.out.print("Enter Exponent: ");
        int exp = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        System.out.println("Answer = " + result);

        sc.close();
    }
}
