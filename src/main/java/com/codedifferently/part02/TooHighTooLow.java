package com.codedifferently.part02;
import java.util.Random;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;

public class TooHighTooLow {

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(50 + 1);
        int userResponse;
        int guessCount = 0;
        ArrayList<Integer> pastGuesses = new ArrayList<Integer>();

        do {
            System.out.println("Guess A Number Between 1 & 50 ");
            userResponse = parseInt(System.console().readLine());
            
            if(pastGuesses.indexOf(userResponse) == -1) {
                guessCount++;
                pastGuesses.add(userResponse);
            } else System.out.println("You already guessed that one.");
            
            if (userResponse < randomNumber) {
                System.out.println("You Guessed Too Low, Guess Again!");    
            }
            if (userResponse > randomNumber) {
                System.out.println("You Guessed Too High, Guess Again!");
            }

        } while (userResponse != randomNumber);

        System.out.printf("%d Is The Right Number!%nIt Took You %d Tries.%n", userResponse, guessCount);
    }
}
