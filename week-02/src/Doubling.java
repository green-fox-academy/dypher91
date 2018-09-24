import java.util.Scanner;

public class Doubling {


    static int baseNum;

    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Put the number you want to double...");

        baseNum = userInput.nextInt();
      System.out.println(userInput(baseNum));

    }

    public static int userInput(int userInput){
        return userInput * 2;
    }




}