import org.junit.Test;
import static org.junit.Assert.*;

public class testApples {

    @Test
    public void testGetApple(){
        Apples apple = new Apples();
        assertEquals("apple",apple.getApple());
    }
}
