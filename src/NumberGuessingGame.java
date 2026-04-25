import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(10) + 1;
        int numberOfAttempts = 0;
        int maxAttempts = 5;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Codveda Number Guessing Game!");
        System.out.println("I have selected number a number between 1 and 10.");
        System.out.println("You have " + maxAttempts + "attempts to guess it");

        while(numberOfAttempts < maxAttempts && !hasGuessedCorrectly)
        {
            System.out.print("\nEnter your guess: ");

            if(!scanner.hasNextInt()){
                System.out.println("Invalid input. Please enter a whole number.");
                scanner.next();
                continue;

            }
            int userGuess = scanner.nextInt();
            numberOfAttempts++;

            if(userGuess == numberToGuess){
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
            }
            else if(userGuess < numberToGuess){
                System.out.println("Too Low! Try again.");
            }
            else
            {
                System.out.println("Too high! Try again.");
            }

            if(!hasGuessedCorrectly)
            {
                System.out.println("Attempts remaining: " + (maxAttempts - numberOfAttempts));
            }
        }
        if(!hasGuessedCorrectly)
        {
            System.out.println("\nGame Over! You've run out of attempts.");
            System.out.println("The correct number was: " + numberToGuess);

        }


    }
}
