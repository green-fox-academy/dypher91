import java.util.*;
public class Matchmaking {
    public static void main(String[] args) {

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve","Ashley","Claire","Kat","Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));

    }

    public static ArrayList<String> makingMatches (ArrayList<String> list1, ArrayList<String> list2){
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < list1.size() ; i++) {


            list.add(list1.get(i));
            list.add(list2.get(i));
        }
        return list;
    }
}
