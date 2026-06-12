import java.util.Random;
import java.util.Scanner;

public class DecodeLabs_Java_P1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int targetNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");

        while (true) {

            System.out.print("Enter your guess: ");

            try {
                guess = sc.nextInt();
                attempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the number.");
                    System.out.println("Attempts taken: " + attempts);
                    break;
                } else if (guess > targetNumber) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("Too Low!");
                }

            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
                sc.next();
            }
        }

        sc.close();
    }
}