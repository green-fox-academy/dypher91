import java.util.Scanner;
public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        System.out.println("This program counts a sum and average of 5 numbers !");
        Scanner number=new Scanner(System.in);
        System.out.println("Put the number 1 - 5 in a row: ");
        int one =number.nextInt();

        int two =number.nextInt();

        int three =number.nextInt();

        int four =number.nextInt();

        int five =number.nextInt();

        int sum =one+two+three+four+five;
        double avg =(one+two+three+four+five)/5;

        System.out.println("Sum is: "+sum);
        System.out.println("Avg is: "+avg);



    }



}
