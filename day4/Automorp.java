package day4;

import java.util.Scanner;

public class Automorp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int square = num * num;

        if (square % (int)Math.pow(10, String.valueOf(num).length()) == num)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");

        sc.close();
    }
}