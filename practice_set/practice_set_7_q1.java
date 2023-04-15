import java.util.Scanner;
public class practice_set_7_q1 {
    public static void multiplication(int n) {
        int prod =1;
        for (int i = 1; i <= 10; i++) {
            prod = n * i;
        System.out.println(n + "*" + i + "=" + prod);
    }}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int k = sc.nextInt();
        multiplication(k);


        }
    }


