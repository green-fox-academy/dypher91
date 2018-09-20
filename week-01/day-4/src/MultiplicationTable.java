import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
        //
        // Example:
        // The number 15 should print:
        //
        // 1 * 15 = 15
        // 2 * 15 = 30
        // 3 * 15 = 45
        // 4 * 15 = 60
        // 5 * 15 = 75
        // 6 * 15 = 90
        // 7 * 15 = 105
        // 8 * 15 = 120
        // 9 * 15 = 135
        // 10 * 15 = 150
        System.out.println("Put the two number...");
        Scanner number = new Scanner(System.in);
        System.out.println("How many times: ");
        int one = number.nextInt();
        System.out.println("The number you want to multicipate");
        int sec = number.nextInt();


        for (int i = 1; i < one+1; i++) {
            int result = i * sec;

           // for (int j = 0; j < i; j++) {

                System.out.println(i + " * " + sec + " = " + result);
           // }
        }
    }
}

