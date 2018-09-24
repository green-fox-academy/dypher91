import java.util.Scanner;
public class Sum {

    static int sum = 0;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Put the max of numbers you want to add..");
        Count();


    }

    public static void Count() {
        int max = input.nextInt();
        System.out.println("Put the numbers...");
        for (int i = 0; i < max; i++) {
           sum += input.nextInt();

        }
        System.out.println("Result is: "+sum);
    }
}







