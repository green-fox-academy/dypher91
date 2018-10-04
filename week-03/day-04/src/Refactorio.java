import java.util.Scanner;

public class Refactorio {
    public static void main(String[] args) {
        // Create a recursive function called `refactorio`
        // that returns it's input's factorial

        Scanner scanner = new Scanner(System.in);
        System.out.println("Put the number from you want to count factorial: ");
        int input = scanner.nextInt();
        System.out.println("And the factorial is: "+refactorio(input) );
    }
    public  static int refactorio(int n){
        return n == 1 ? 1 : n * refactorio(n-1);
        }
    }

