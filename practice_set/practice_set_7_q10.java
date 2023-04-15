import java.util.Scanner;
public class practice_set_7_q10 {

        static int SumNaturalNumIterative (int n)
        {
            int sum = 0;
            for (int i = 0; i <= n; i++)
            {
                sum += i;
            }
            return sum;
        }

        public static void main (String[]args)
        {
            Scanner scan = new Scanner (System.in);
            System.out.print ("Enter a Number: ");
            int Number = scan.nextInt ();
            int Sum = SumNaturalNumIterative (Number);
            System.out.println ("Sum of 1 to " + Number + " natural Number: " + Sum);
        }
    }


