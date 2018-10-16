import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public int getIndex(List<String> list, String itemToSearchFor) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(itemToSearchFor)) {
                return i;
            }
        }return -1;
    }


}



