import java.util.Scanner;

public class practice_set_7_q5 {
    public static int fibo(int n){
        if(n==1){   //index 1 hai toh usme zero aata
            return 0;
        }
        else if (n==2){  //index 2 hai toh usme 1 aata
            return 1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n= sc.nextInt();
        System.out.println(fibo(n));

    }
}
