import java.util.Arrays;
import java.util.List;

public class CountLetters {
    String string;
    char someChar='e';
    int count=0;

    public CountLetters(String string) {
        this.string = string;

    }

    public CountLetters(){
        this("element");
    }

    public int countIndex(){
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == someChar) {
                count++;
            }

        }

        return count;
    }
}
