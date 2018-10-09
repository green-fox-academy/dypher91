package Comparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class Main {
    public static void main(String[] args) {

        ArrayList<Domino> dominos = new ArrayList<>();

        dominos.add(new Domino(5, 2));
        dominos.add(new Domino(4, 6));
        dominos.add(new Domino(1, 5));
        dominos.add(new Domino(6, 7));
        dominos.add(new Domino(2, 4));
        dominos.add(new Domino(7, 1));

        Collections.sort(dominos);
        System.out.println(dominos);

        ArrayList<Thing> things = new ArrayList<>(0);
        things.add(new Thing("Get Milk"));
        things.add(new Thing("Remove the obstacles"));
        Thing bed = new Thing("Stand up");
        bed.complete();
        Thing lunch = new Thing("Eat lunch");
        lunch.complete();
        things.add(bed);
        things.add(lunch);

        Collections.sort(things);
        System.out.println(things);









    }



}
