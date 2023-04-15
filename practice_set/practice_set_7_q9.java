import java.util.Scanner;
public class practice_set_7_q9 {
   public static float conversionTemp(int n){
        if(n==0){
            return 32f;
        }else {
            return n*9.0f/5.0f+32f;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Temp you want to convert");
        int temp= sc.nextInt();
        float res= conversionTemp(temp);
        System.out.println(res);
}}
