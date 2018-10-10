import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class test_01 {

    @Test
    public void testGetApple(){
        Apples apples = new Apples();
        assertEquals("apple",apples.getApples());
    }

}
