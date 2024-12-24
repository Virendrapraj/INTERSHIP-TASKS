import java.util.Scanner;
import java.util.Random;
public class task3 {
    


    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

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

            // Loop until the user guesses correctly
            boolean guessedCorrectly = false;
            while (!guessedCorrectly) {
                // Prompt the user to guess the number
                System.out.print("Guess the number between " + min + " and " + max + ": ");
                int userGuess = scanner.nextInt();

                // Provide feedback
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations You guessed it right. The number was " + randomNumber + ".");
                    guessedCorrectly = true;
                } else if (userGuess < randomNumber) {
                    System.out.println(" Your number is Too low Try again.");
                } else {
                    System.out.println(" Your number is Too high Try again.");
                }
            }
        }

       
    }
}

