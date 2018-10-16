import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class MainTest {

    @Test
    public void returnTheIndex() {
        Main main = new Main();
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("green");
        list.add("fox");
        list.add("vulpes");
        assertEquals(2, main.getIndex(list, "fox"));
    }
    @Test
    public void returnOne() {
        Main main = new Main();
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("green");
        list.add("fox");
        list.add("vulpes");
        assertEquals(1, main.getIndex(list, "green"));
    }
    @Test
    public void returnAllTheCorrect() {
        Main main = new Main();
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("green");
        list.add("fox");
        list.add("vulpes");
        for (int i = 0; i < list.size(); i++) {

            assertEquals(i, main.getIndex(list, list.get(i)));

        }
    }
}
