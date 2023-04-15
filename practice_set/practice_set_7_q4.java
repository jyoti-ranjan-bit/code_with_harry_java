import java.util.Scanner;

public class practice_set_7_q4 {
    public static void pattern(int n){
        for (int i=4;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int p=4;
        pattern(p);
    }

    public static class practice_set_7_q3 {
        public static int recsum(int n){
            if(n==1){
                return 1;
            }
            else{
                return n+ recsum(n-1);
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a no");
            int n= sc.nextInt();
            System.out.println(recsum(n));
        }
    }
}
