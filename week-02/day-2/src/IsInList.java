import java.util.*;
public class IsInList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        System.out.println(checkNums(list,4,8,12,16));
        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"

    }
    public static boolean checkNums(ArrayList<Integer> list, int number1, int number2, int number3, int number4) {
     boolean returns = list.containsAll(new ArrayList<>(Arrays.asList(number1,number2,number3,number4)));
     return returns;
    }
}

