import java.util.Scanner;
public class DrawSquare {
    public static void main(String[] args) {
        System.out.println("Put the number of size, do you wish, the square should have.");

        Scanner number = new Scanner(System.in);
        int cislo = number.nextInt();

        for (int i = 0; i < cislo; i++) {
            if (i == 0 || i == cislo - 1) {
                for (int j = 0; j < cislo; j++) {
                    System.out.print("%");
                }
            } else {
                System.out.print("%");
                for (int k = 1; k < i; k++) {
                    System.out.print(" ");
                }


                System.out.print("%");
                for (int l = 1; l < cislo-i-1; l++) {
                    System.out.print(" ");
                }
                System.out.print("%");
            }
            System.out.println();


        }
    }
}
