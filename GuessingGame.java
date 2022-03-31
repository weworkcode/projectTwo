import java.util.Scanner;
import java.util.Random;

public class GuessingGame{
   public static void main (String [] args){
    
    //Variables
    Random randomNumber = new Random();
    Scanner input = new Scanner(System.in);
    int computerValue = randomNumber.nextInt(100);
    int numberOfTries = 0;
    int guess = 0;
    
    
    //Logic
    while(true) {
    computerValue = randomNumber.nextInt(100);
    numberOfTries = 0;
    while (true) {
        System.out.println("Guess a"
                + " number from 1 - 100:  ");
        guess = input.nextInt();
        numberOfTries++;

        if (guess < 1 || guess > 100) System.out.println("Invalid input");
        else if (guess == computerValue) {
            System.out.println("You've guessed correct! Total number of guesses: " + numberOfTries + " and the correct input was: " + computerValue);
            // leave the first loop
            break;
        }
        else if (guess < computerValue) System.out.println("Your guess is smaller than the random value. Next guess: ");
        else if (guess > computerValue) System.out.println("Your guess is larger than the random value. Next guess: ");
        
    }
    
    //End game if guesses right
    if(guess == computerValue)
                break;
}
    
    }
}
