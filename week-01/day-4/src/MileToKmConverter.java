import java.util.Scanner;
public class MileToKmConverter {
    public static void main(String[] args) {
        System.out.println("This app converts KM to MILES !");
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it
        Scanner km=new Scanner(System.in);
        System.out.println("Enter the number in kilometers you want to convert: ");
        int miles=km.nextInt();

        double result=miles*1.6;

        System.out.println("The result: "+miles+" KM is: "+result+" MILES !");
    }
}
