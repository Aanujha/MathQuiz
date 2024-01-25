import java.util.Scanner;

public class GuessNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");

        int randomNumber = (int) (Math.random() * 100) + 1;

        int userGuess;
        boolean GuessedCorrectly = false;
        int attempts= 0;

        while (!GuessedCorrectly) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                GuessedCorrectly = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
        scanner.close();
    }

}
