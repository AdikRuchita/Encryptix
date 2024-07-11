package Encryptix;

import java.util.Random;
import java.util.Scanner;

public class Numbergame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attempts = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("I have generated a number between 1 and 100. Try to guess it!");

            while (attempts < 10 && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Correct! You've guessed the number!");
                    hasGuessedCorrectly = true;
                    score++;
                }

                if (attempts == 10 && !hasGuessedCorrectly) {
                    System.out.println("You've used all attempts! The number was: " + numberToGuess);
                }
            }

            System.out.println("Your current score is: " + score);
            System.out.print("Do you want to play another round? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing! Your final score is: " + score);
        scanner.close();
    }


	}


