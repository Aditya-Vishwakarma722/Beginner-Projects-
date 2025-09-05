import java.util.Random;
import java.util.Scanner;

class Guess{
    Random rnd = new Random();
    int target = rnd.nextInt(100)+1;

    boolean answer(int num){
        int diff = Math.abs(target - num);
        if(num == target){
            System.out.println("Congratulation! You've Guessed the Right Number!");
            return true;
        }
        else if(num<target){  //if number < target
            if(diff<=10){
                System.out.println("You are Close! Guess a Little Higher number!");
            }
            else if(diff<=25){
                System.out.println("You are a little far! Guess a more Higher number!");
            }
            else if(diff<=50){
                System.out.println("You are a too far! Guess even more Higher number!");
            }
        }
        else{                //if number > target
            if(diff<=10){
                System.out.println("You are Close! Guess a Little Lower number!");
            }
            else if(diff<=25){
                System.out.println("You are a little far! Guess a more Lower number!");
            }
            else if(diff<=50){
                System.out.println("You are a too far! Guess even more Lower number!");
            }
        }
        return false;
        }

    }

public interface Guess_the_Number_Game {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int userInput;
        String choice;

        do{
            Guess game = new Guess();  // New game each time
            boolean guessed = false;

            System.out.println("🎯 Welcome to Guess the Number Game!");
            System.out.print("Enter Your Guess [Between 1 - 100] : ");
            userInput = scn.nextInt();
            scn.nextLine();

            game.answer(userInput);

            System.out.println("Do you want to play again?");
            choice = scn.nextLine().toLowerCase();
        }while (choice.equals("yes"));

        System.out.println("Thanks for Playing!");
        scn.close();
    }

}
