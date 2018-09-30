import java.util.Scanner;
public class Factorio {
    static Scanner input = new Scanner(System.in);
    static int fact=1;


    public static void main(String[] args) {
        countFactorio();

    }

    public static void countFactorio(){
        System.out.println("Put the number..");
        int number=input.nextInt();
        if (number <= 0){
            System.out.println("Start over, with diff number");
        }else {
            for (int i = 1; i <= number; i++) {
                fact = fact * i;
            }
        }
        System.out.println("Factorial is: "+fact);


    }




}
