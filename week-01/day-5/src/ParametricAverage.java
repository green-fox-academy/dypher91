import java.util.Scanner;
public class ParametricAverage {
    public static void main(String[] args) {
        System.out.println("How many integers you want to put in..");
        Scanner numbers = new Scanner(System.in);

        int howMany = numbers.nextInt();
        System.out.println("Put in " + howMany + " numbers:");
        int sum = 0;

        for (int i = 0; i < howMany; i++) {
            sum += numbers.nextInt();
        }
        System.out.print("Sum: " + sum + " Avg: " + (sum / howMany));
    }
}







