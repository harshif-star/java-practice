package day8;

import java.util.Scanner;

public class Prob10 {

    static int reverse(int n) {

        int rev = 0;

        while (n != 0) {

            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(reverse(sc.nextInt()));

        sc.close();
    }
}