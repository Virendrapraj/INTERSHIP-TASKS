import java.util.Scanner;
import java.util.Random;
public class task7 {
   
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Guess the Number Game!");

        // Outer loop to allow multiple rounds
        boolean playAgain = true;
        while (playAgain) {
            // Prompt the user to enter the range
            System.out.print("Enter the minimum value of the range: ");
            int min = scanner.nextInt();

            System.out.print("Enter the maximum value of the range: ");
            int max = scanner.nextInt();

            // Validate the range
            if (min > max) {
                System.out.println("Invalid range. Minimum value should be less than or equal to the maximum value.");
            } else {
                // Generate a random number within the specified range
                Random random = new Random();
                int randomNumber = random.nextInt((max - min) + 1) + min;

                // Set the maximum number of attempts
                int maxAttempts = 5;
                System.out.println("You have " + maxAttempts + " attempts to guess the number!");

                // Loop through the attempts
                boolean guessedCorrectly = false;
                for (int attempt = 1; attempt <= maxAttempts; attempt++) {
                    // Prompt the user to guess the number
                    System.out.print("Attempt " + attempt + ": Enter your guess: ");
                    int userGuess = scanner.nextInt();

                    // Check the guess and provide feedback
                    if (userGuess == randomNumber) {
                        System.out
                                .println("Congratulations! You guessed it right. The number was " + randomNumber + ".");
                        guessedCorrectly = true;
                        break; // Exit the loop
                    } else if (userGuess < randomNumber) {
                        System.out.println("Too low! Try again.");
                    } else {
                        System.out.println("Too high! Try again.");
                    }
                }

                // If the user failed to guess the number within the attempts
                if (!guessedCorrectly) {
                    System.out.println(
                            "Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
                }
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
        }

        // Goodbye message
        System.out.println("Thank you for playing! Goodbye.");
    }
}

