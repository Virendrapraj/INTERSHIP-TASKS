package TASK3PROBLEM;
import java.util.*;
public class TASK02 {
    
    static class Question {
        String question;
        String[] options;
        int correctAnswer; // Index of the correct option (0-based)

        Question(String question, String[] options, int correctAnswer) {
            this.question = question;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List of quiz questions
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of France?",
                new String[] { "1. Paris", "2. London", "3. Rome", "4. Berlin" }, 0));
        questions.add(new Question("Which programming language is platform-independent?",
                new String[] { "1. Python", "2. Java", "3. C++", "4. JavaScript" }, 1));
        questions.add(new Question("Which planet is known as the Red Planet?",
                new String[] { "1. Venus", "2. Mars", "3. Jupiter", "4. Saturn" }, 1));
        questions.add(new Question("Who wrote 'Romeo and Juliet'?",
                new String[] { "1. Charles Dickens", "2. J.K. Rowling", "3. William Shakespeare", "4. Mark Twain" },
                2));

        questions.add(new Question("What is the largest Animal in the world?",
                new String[] { "1. Elephant", "2. Blue Whale", "3. Giraffe", "4. Hippopotamus" }, 1));

        // Initialize variables for score and results
        int score = 0;
        List<Boolean> results = new ArrayList<>();

        System.out.println("Welcome to the Quiz Game!");
        System.out.println("You have 10 seconds to answer each question. Good luck!");

        for (int i = 0; i < questions.size(); i++) {
            Question question = questions.get(i);

            // Display the question and options
            System.out.println("\nQuestion " + (i + 1) + ": " + question.question);
            for (String option : question.options) {
                System.out.println(option);
            }

            // Start a timer for the question
            long startTime = System.currentTimeMillis();
            long endTime = startTime + 10000; // 10 seconds

            System.out.print("Your answer (enter the option number): ");
            int userAnswer = -1;

            // Check if the user answers within the time limit
            while (System.currentTimeMillis() < endTime) {
                if (scanner.hasNextInt()) {
                    userAnswer = scanner.nextInt() - 1; // Convert 1-based to 0-based index
                    break;
                }
            }

            if (userAnswer == -1) {
                System.out.println("Time's up! Moving to the next question.");
                results.add(false);
            } else if (userAnswer == question.correctAnswer) {
                System.out.println("Correct!");
                score++;
                results.add(true);
            } else {
                System.out.println("Wrong! The correct answer was: " + (question.correctAnswer + 1));
                results.add(false);
            }
        }

        // Display the final results
        System.out.println("\n----- Quiz Over -----");
        System.out.println("Your Final Score: " + score + "/" + questions.size());
        System.out.println("\nSummary of Results:");
        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Question " + (i + 1) + ": " + (results.get(i) ? "Correct" : "Incorrect"));
        }

        System.out.println("Thank you for playing!");

        scanner.close();
    }
}


