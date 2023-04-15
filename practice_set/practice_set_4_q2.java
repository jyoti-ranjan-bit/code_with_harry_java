import java.util.Scanner;

public class practice_set_4_q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entyer marks in 1st subject:");
        double a=sc.nextDouble();
        System.out.println("Entyer marks in 2nd subject:");
        double b=sc.nextDouble();
        System.out.println("Entyer marks in 3rd subject:");
        double c=sc.nextDouble();
        double sum=a+b+c;
        double percent=(sum/300)*100;
        System.out.println(percent);
        if(percent >=40 && a>=33 && b>=33 && c>=33){
            System.out.println("passed");
        }
        else{
            System.out.println("failed");
        }

    }
}
