import java.lang.reflect.Array;
import java.util.List;

public class NumberConvert {
    List<String> list;

    public NumberConvert(List<String> list) {
        this.list = list;
    }

    public NumberConvert() {

    }

    public int getIndex(List list, Object itemToSearchFor) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if ((list.get(i) != null && list.get(i).equals(itemToSearchFor))
                        || (list.get(i) == null && itemToSearchFor == null)) {
                    return i;
                }
            }
        }
        return -1;
    }
}






