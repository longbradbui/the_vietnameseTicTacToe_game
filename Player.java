import java.util.Random;
import java.util.Scanner;

public class Player {

    // ASSIGNS PLAYER'S TURN //
    public int assignPlayers(){
        Random turn = new Random();                              //  Construct a Random Object
        int playerTurn = turn.nextInt(1,3);                     //   Generate a number from 1 and stops at 3
        if (playerTurn == 1){
            return 1; // Player 1 goes
        }
        return 2;   // Players 2 goes
    }

    // GENERATES MOVES FOR PLAYERS //
    public int generateMove (int playersTurn, int maxColumn, String name, Board board){
        System.out.println("\t\t------*****------");
        System.out.println("It is " + name + "'s [Player " + playersTurn + "]"  + " turn. Please choose a column.");
        Scanner console2 = new Scanner(System.in);               // Construct a Scanner prompts for player's desired column
        int playerMove = console2.nextInt();
            if (playerMove > 0 && playerMove <= maxColumn) {   // If the number satisfies the condition
                return playerMove;                            //  Then return player's column
            }
            throw new IllegalArgumentException();           // throw exception if fails the condition
    }

    // PRINTS OUT ERROR MESSAGE WITH SPECIFIC ERROR //
    public void errorMessage (String custom){
        System.out.println("Your input was invalid. Try again. \n" + custom);
    }

}
