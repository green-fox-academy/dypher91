import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.
        System.out.println("Put the one number...");
        Scanner number=new Scanner(System.in);
        int one =number.nextInt();
        if(one%2==0){
            System.out.println("The number is Even! ");
        }else {
            System.out.println("The number is Odd! ");
        }
        }






}
