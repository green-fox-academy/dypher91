import java.util.Scanner;
public class AppendAFunc {
    static String typo = new String("Chinchill");
    static Scanner userInput = new Scanner(System.in);
    static String userString;
    static String a="a";

    public static void main(String[] args) {

    System.out.println("Put the string you want to input");



    appendAFunc();
    System.out.println(typ(typo));


    }

    public static void appendAFunc(){

    userString = userInput.nextLine();
    System.out.println(userString+a);
    System.out.println(typo + a);
    }


    public static String typ(String typo){
       return typo + a;
    }
}


