package Comparator;
import java.util.ArrayList;
import java.util.List;

public class Domino implements Comparable<Domino> {
    int[] values;
    //ArrayList<Domino> dominoes = new ArrayList<>();

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public Domino() {

    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }


    @Override
    public int compareTo(Domino o){
        return toString().compareTo(o.toString());

    }


}
