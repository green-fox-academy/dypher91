import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was
        System.out.println("Put the number of lines, do you wish, the triangle should have.");
        Scanner number = new Scanner(System.in);
        int cislo = number.nextInt();
        if (cislo % 2 == 0) {
            System.out.println("Put odd number!");
        } else {
            for (int i = 1; i < cislo; i += 2) {
                for (int j = 0; j < cislo - i / 2; j++)
                    System.out.print(" ");

                for (int j = 0; j < i; j++)
                    System.out.print("*");

                System.out.print("\n");
            }

            for (int i = cislo; i > 0; i -= 2) {
                for (int j = 0; j < cislo - i / 2; j++)
                    System.out.print(" ");

                for (int j = 0; j < i; j++)
                    System.out.print("*");

                System.out.print("\n");
            }
        }
    }
}
