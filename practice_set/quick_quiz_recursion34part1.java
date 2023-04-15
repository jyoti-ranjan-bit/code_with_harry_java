//program to calculate factorial of a number in java (using recursion)
public class quick_quiz_recursion34part1 {
    public static int factorial(int a){
        if (a==0 || a==1){
            return 1;
        }
        else{
            return a*factorial(a-1);
        }
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println("factorial is:"+factorial(n));


    }
}
