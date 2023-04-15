import java.util.Scanner;
public class practice_set_1_q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter kilometers:");
        double km=sc.nextDouble();
        double miles=km*0.621371;
        System.out.println("kilometer "+km+" miles "+miles);
    }
}
