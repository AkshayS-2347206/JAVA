import java.util.Random;
import java.util.Scanner;

class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int lower = 1;
        int upper = 100;
        int numberToGuess = random.nextInt(upper - lower + 1) + lower;
        int attempts = 0;
        int maxAttempts = 5;

        while (attempts < maxAttempts) {
            System.out.println("Enter Your Guess (1-100)");
            int playerGuess = sc.nextInt();

            if (playerGuess < lower || playerGuess > upper) {
                System.out.println("Enter number between 1 - 100");
            }

            attempts++;

            if (playerGuess == numberToGuess) {
                System.out.println("Congrats You win!");
                break;
            } else if (playerGuess < numberToGuess) {
                System.out.println("Try higher number");
            } else {
                System.out.println("Try lower number");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Out of attempts");
            System.out.println("Random number is: " + numberToGuess);
        }

    }
}