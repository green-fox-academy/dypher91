import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class DividedByZero {


    public static void main(String[] args) {
        System.out.println("Put the number you want to divides 10 by it: ");
        try {
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            int result = 10 / number;
            System.out.println(result);


        }catch (ArithmeticException e) {
            System.out.println("fail!");
        }
    }

}

