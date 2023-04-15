//program to find fibonacci series using recursion.
public class quick_quiz_recursion34part2 {
    public static int fibonacci(int a) {
        if (a==1 || a==2) {
            return a-1;
        }
         else {
            return fibonacci(a - 1) + fibonacci(a - 2);
        }
    }
        public static void main(String[]args){
            int n = 25;
           // for (int i = 0; i <= n; i++) {
                System.out.print("fibonacci series is: " + fibonacci(n)+" ");
            }

        }



