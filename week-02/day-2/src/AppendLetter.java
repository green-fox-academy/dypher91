import java.util.*;
import java.util.Arrays;

public class AppendLetter {
    public static void main(String[] args) {
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

       System.out.println(appendA(far));

    }

     public static List<String> appendA (List<String> listA){
         for (int i = 0; i < listA.size() ; i++) {
             listA.set(i, listA.get(i)+"a");
         }return listA;




    }
}

