import java.util.Scanner;
import java.util.Random;   //This is the import statement required to select a random object.

public class RockPaperScissors_Game {
    public static void main(String[] args) {
        System.out.print("Hello Gamer ! Welcome to the game.\nWanna play.......!!!!!!!\n\n" +
                "Enter 'R' for ROCK.\nEnter 'P' for PAPER.\nEnter 'S' for SCISSORS.");

        int Rock = 0;
        int Paper = 1;
        int Scissors = 2;
        while(true){
        System.out.print("\n\nEnter the object you want to use : ");
        //Taking input from the user.
        Scanner input = new Scanner(System.in);
        String gamer1 = input.next();

        //Generating a random integer from "0" to "2" .
        Random computer = new Random();
        int gamer2 = computer.nextInt(3);

        if(gamer2==Rock){
            switch (gamer1) {
                case "R" -> System.out.println("Rock vs Rock !!! It's a tie.");
                case "P" -> System.out.println("Rock vs Paper !!! Congrats you won.");
                case "S" -> System.out.println("Rock vs Scissors !!! Sorry you lost.");
            }
        }
        else if(gamer2==Paper){
            switch (gamer1) {
                case "R" -> System.out.println("Paper vs Rock !!! Sorry you lost.");
                case "P" -> System.out.println("Paper vs Paper !!! It's a tie.");
                case "S" -> System.out.println("Paper vs Scissors !!! Congrats you won.");
            }
        }
        else if(gamer2==Scissors){
            switch (gamer1) {
                case "R" -> System.out.println("Scissors vs Rock !!! Congrats you won.");
                case "P" -> System.out.println("Scissors vs Paper !!! Sorry you lost.");
                case "S" -> System.out.println("Scissors vs Scissors !!! It's a tie.");

            }
            }
        }
    }

}