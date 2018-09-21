import java.util.Scanner;
public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was
        System.out.println("Put the number of lines, do you wish, the triangle should have.");
        Scanner number = new Scanner(System.in);
        int cislo =number.nextInt();
        for (int i=0; i<cislo;i++){
            int n=1;
            do {
                System.out.print("*");
                n++;
            }while (n<=i);
            System.out.println("");


        }



    }
}
