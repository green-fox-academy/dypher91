import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was
        System.out.println("Put the number of lines, do you wish, the triangle should have.");
        Scanner number = new Scanner(System.in);
        int cislo =number.nextInt();
        for(int i=0;i<cislo;i++) {
            for(int j=0;j<cislo-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
