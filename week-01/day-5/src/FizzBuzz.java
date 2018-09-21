import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print “Fizz” instead of the number
        // and for the multiples of five print “Buzz”.
        // For numbers which are multiples of both three and five print “FizzBuzz”.
        System.out.println("Put the two number...");
        Scanner between = new Scanner(System.in);
        int first = between.nextInt();
        System.out.println("and the second number..");
        int second = between.nextInt();
        if (second < first) {
            System.out.println("The second number should be bigger");
        } else {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && !(i % 5 == 0)) {
                    System.out.println("Fizz");
                    continue;
                } else if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                    continue;
                } else if (!(i % 3 == 0) && i % 5 == 0) {
                    System.out.println("Buzz");
                    continue;
                }

                System.out.println(i);
            }


        }
    }
}
