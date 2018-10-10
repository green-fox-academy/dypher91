import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;


public class testSum {
        @Test
    public void testGetSum() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,10);
        list.add(1,20);
        list.add(2,30);
        Sum result = new Sum();

        assertEquals(60, result.getSum(list));

    }
    @Test
    public void test_2_getSum(){
        ArrayList<Integer> list_2 = new ArrayList<>();
        Sum result_2 = new Sum();

        assertEquals(0,result_2.getSum(list_2));
    }
}
