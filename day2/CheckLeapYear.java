package day2;
import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leap = sc.nextInt();
        if((leap % 4 == 0 && leap % 100 != 0) || (leap % 400 == 0)){
            System.out.println("this is leapyear");

        }else{
            System.out.println("this is not leap year");
    
        }sc.close();

    }
}
