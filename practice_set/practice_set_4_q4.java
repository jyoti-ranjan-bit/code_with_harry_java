import java.util.Scanner;

public class practice_set_4_q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("sunday");
        }
    }
}
