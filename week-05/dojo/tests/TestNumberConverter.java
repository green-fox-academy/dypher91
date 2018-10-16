import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestNumberConverter {

    @Test
    public void convertOneNumber() {
        NumberConvert convert = new NumberConvert();
        List<String> ones = Arrays.asList("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen");
        assertEquals(1,convert.getIndex(ones,"one"));



    }
}












