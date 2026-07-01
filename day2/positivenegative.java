package day2;

import java.util.Scanner;

public class Positivenegative {
    public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();
      if (var2 > 0) {
         System.out.println("the num is positive");
      } else if (var2 < 0) {
         System.out.println("the num is negative");
      } else {
         System.out.println("the num is zero");
      }

   }
}
