import java.util.Scanner;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Calculator {
    public static void main(String[] args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        System.out.println("Please type in the expression:");
        Scanner input = new Scanner(System.in);


        char operator = input.next().charAt(0);
        int a = input.nextInt();
        int b = input.nextInt();

        boolean chyba = false;
        float vysledek = 0;
        switch (operator) {
            case '+':
                vysledek = a + b;
                break;
            case '-':
                vysledek = a - b;
                break;
            case '*':
                vysledek = a * b;
                break;
            case '%':
                vysledek = ((float) b / a)*100;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("b nesmí být nula! Nulou nelze dělit.");
                    chyba = true;
                } else {
                    vysledek = (float) a / b; // float / int dava vysledek realny
                }
                break;
            default:
                System.out.println("Zadán špatný operátor!");
                chyba = true;
                break;
        }
        if (!chyba) {
            System.out.format("Výsledek je: %.2f%n", vysledek); // tisk vysledku na 2 desetinna mista

        }


    }
}
