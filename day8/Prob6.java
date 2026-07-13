package day8;

import java.util.Scanner;

public class Prob6 {

    static void check(int n) {

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        check(sc.nextInt());

        sc.close();
    }
}