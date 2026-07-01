package day2;
import java.util.Scanner;

public class Simpcal {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        int num1 = sc.nextInt();
        int x = sc.nextInt();
        switch(x){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("invalid");
        }
    }    
}
