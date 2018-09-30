import java.util.*;
public class QuoteSwap {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        quoteSwap(list);
        // Expected output: "What I cannot create I do not understand."
        System.out.println(quoteString(list));
    }

    public static ArrayList<String> quoteSwap(ArrayList<String> arrayList){
        arrayList.set(2,arrayList.get(5)); //nastavim novou instanci listu s tim ze vytvorim list na 2 pozici a dam sem stazene slovo z 5 pozice
        arrayList.set(5,arrayList.get(2)); //nastavim novou instanci, 5 pozici nahradim slovem z druhe pozice
        return arrayList;
    }
    public static String quoteString(ArrayList<String> newArrayList) {
        String quote = "";
        for(int i = 0; i < newArrayList.size(); i++) {
            quote += " " + newArrayList.get(i);
        }
        return quote;
    }
}
