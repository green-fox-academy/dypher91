import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class testApples {

    @Test
    public void testGetApple(){
        Apples apple = new Apples();
        assertEquals("apple",apple.getApple());
    }

}
