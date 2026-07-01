package day4;
import java.util.Scanner;

public class DeciTOBi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Decimal Number: ");
        int num = sc.nextInt();

        String binary = "";

        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }

        System.out.println("Binary = " + binary);

        sc.close();
    }
}
