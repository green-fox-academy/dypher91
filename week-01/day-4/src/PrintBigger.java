import java.util.Scanner;
public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        System.out.println("Put it two numbers...");
        Scanner number=new Scanner(System.in);
        int first=number.nextInt();
        int second=number.nextInt();

        if (first > second){
            System.out.println(first);
        }else {
            System.out.println(second);
        }
    }
}
