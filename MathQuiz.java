import java.util.Random;
import java.util.Scanner;

public class MathQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        int Questions = 5;

        for (int i = 1; i <= Questions; i++) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int answer = num1 + num2;

            System.out.println("Question " + i + ": What is " + num1 + " + " + num2 + "?");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer is " + answer + "\n");
            }
        }

        System.out.println("Quiz complete! Your score is: " + score + " out of " + Questions);
        scanner.close();
    }
}



