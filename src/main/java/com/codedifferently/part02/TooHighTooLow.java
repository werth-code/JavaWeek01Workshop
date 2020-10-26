package com.codedifferently.part02;
import java.util.Random;
import static java.lang.Integer.parseInt;

public class TooHighTooLow {

    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(50 + 1);
        int userResponse;

        do {
            System.out.println("Guess A Number Between 1 & 50 ");
            userResponse = parseInt(System.console().readLine());

            if (userResponse < randomNumber) System.out.println("You Guessed Too Low, Guess Again!");
            else System.out.println("You Guessed Too High, Guess Again!");
        
        } while (userResponse != randomNumber);

        System.out.printf("%d Is The Right Number!%n%n", userResponse);
    }
}
