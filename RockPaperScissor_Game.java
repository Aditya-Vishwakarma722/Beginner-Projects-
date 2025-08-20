import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor_Game {
    public static void main(String[] args){
        Random rand = new Random();
        String[] Options = {"rock","paper","scissor"};
        Scanner scn = new Scanner(System.in);
        String ch;

        do {

            System.out.print("Enter Your Choice [Rock,Paper,Scissor] : ");
            String choice = scn.nextLine().toLowerCase();

            if (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissor")) {
                System.out.println("Invalid Choice");
            }

            else{
                int res = rand.nextInt(3);
                String compChoice = Options[res];

                if(choice.equals(compChoice)){
                    System.out.println("Your Choice : " + choice + "\nComputer's Choice : " + compChoice + "\nResult : Match Tied!");

                }
                else if((choice.equals("rock") && compChoice.equals("scissor")) || (choice.equals("scissor") && compChoice.equals("paper")) || (choice.equals("paper") && compChoice.equals("rock"))){
                    System.out.println("Your Choice : " + choice + "\nComputer's Choice : " + compChoice + "\nResult : You Win!");
                }
                else{
                    System.out.println("Your Choice : " + choice + "\nComputer's Choice : " + compChoice + "\nResult : You Lose!");

                }
            }

            System.out.print("Do you want to play again : [Yes/No] : ");
            ch = scn.nextLine().toLowerCase();
            System.out.println(" ");
        }while(ch.equals("yes"));

        System.out.println("Thanks For Playing!");
        scn.close();
    }
}
