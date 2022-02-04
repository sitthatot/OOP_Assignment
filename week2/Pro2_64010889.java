import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Pro2_64010889 {
    public static void main(String[] args) {
        String[] hands = {"scissor", "rock", "paper"};
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int computer = random.nextInt(3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int you = scanner.nextInt();

        if(computer == you)
            System.out.println("The computer is " + hands[computer] + ". You are " + hands[you] + " too. It is a draw");
        else if(computer == 0 && you == 1)
            System.out.println("The computer is " + hands[computer] + ". You are " + hands[you] + " You Won");
        else if(computer == 0  && you == 3)
            System.out.println("The computer is " + hands[computer] + ". You are " + hands[you] + " You Lose");
        else if(computer == 1 && you == 0)
            System.out.println("The computer is " + hands[computer] + ". You are " + hands[you] + " You Lose");
        else if(computer == 1 && you == 2)
            System.out.println("The computer is " + hands[computer] + ". You are " + hands[you] + " You Won");
        else if(computer == 2 && you == 0)
            System.out.println("The computer is " + hands[computer] + ". You are " + hands[you] + " You Won");
        else if(computer == 2 && you == 1)
            System.out.println("The computer is " + hands[computer] + ". You are " + hands[you] + " You Lose");
        else if(you > 2)
            System.out.println("Please enter number between 0 - 2 next time!");
    }
}
