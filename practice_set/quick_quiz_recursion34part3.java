public class quick_quiz_recursion34part3 {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void fibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fibonacci(count - 1);
        }
    }



    public static void main (String[]args){
        int n = 10;
        System.out.print(n1+" "+n2);
        fibonacci(n-2);
    }
}
