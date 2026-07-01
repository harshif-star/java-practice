package day2;

public class Gradecal {
    public static void main(String[] args) {
        String grade = "A";
        switch (grade){
        case "O":
            System.out.println("90 mark");
            break;
        case "A":
            System.out.println("80 mark");
            break;
        case "B":
            System.out.println("70 mark");
            break;
        default:
            System.out.println("invalid grade");
            break;
        }
        
    }
    
}
