import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            Random rand = new Random();
            System.out.println("scissor (0), rock (1), paper (2):");
            int user = scan.nextInt();
            int computer = rand.nextInt(3);

            switch (user) {
                case 0:
                    System.out.println("scissor");
                    break;
                case 1:
                    System.out.println("rock");
                    break;
                default:
                    System.out.println("paper");
            }


            switch (computer) {
                case 0:
                    System.out.println("scissor");
                    break;
                case 1:
                    System.out.println("rock");
                    break;
                default:
                    System.out.println("paper");
            }


            if (user == computer) {
                System.out.println("It is a draw.");
            } else if (user == 0 && computer == 2 || user == 1 && computer == 0 || user == 2 && computer == 1) {
                System.out.println("You won.");
            } else {
                System.out.println("You lost.");
            }
            scan.close();
        }
    }

