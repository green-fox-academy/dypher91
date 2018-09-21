import java.util.Scanner;
public class SubStr {
    public static int subStr(String input, String n){
        int index = input.indexOf(n);
        return index+1;

    }
    public static void main(String[] args) {

        Scanner read=new Scanner(System.in);

        System.out.println("Write your first string..");
        String first=read.nextLine();
        System.out.println("What are you searching for?");
        String search=read.nextLine();


        System.out.println(subStr(first,search));


    }
}
