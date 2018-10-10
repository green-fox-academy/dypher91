import java.util.ArrayList;
import java.util.List;

public class Sum {
    ArrayList<Integer> list;
    int sum = 0;

    public Sum(ArrayList<Integer> list) {
        this.list = list;
    }

    public Sum() {

    }

    public int getSum(ArrayList<Integer> list){
        for (int i : list) {
            sum = sum + i;
        }return sum;
    }
}
