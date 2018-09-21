import java.util.Scanner;
public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
        // The user can input guesses, after each guess the program would tell one
        // of the following:
        //
        // The stored number is higher
        // The stried number is lower
        // You found the number: 8

        Scanner number = new Scanner(System.in);
        int guess;
        int a=27;
        int count=0;

        System.out.println("Guess the number from 1 - 100");
        guess = number.nextInt();

        while (guess != a) {
            guess = number.nextInt();
            count++;
            if (guess > a) {
                System.out.println("lower!");
            } else if (guess < a) {
                System.out.println("higher!");
            }
        }
        System.out.println("Congratulations. You guessed the number with "
                + count + " tries!");
    }
}









