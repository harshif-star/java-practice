package day2;
import java.util.Scanner;

public class VowelsOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String alp = sc.nextLine();
         if(alp.equals("a") || alp.equals("e") || alp.equals("i") || alp.equals("o") || alp.equals("u")) { 
            System.out.println("this is VOwels");
        }else {
            System.out.println("this is consonant");
        }
    }
    
}
