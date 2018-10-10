import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FibonaciiTest {
    Fibonacci input;

    @Before
    public void createInput(){
        input= new Fibonacci();
    }

    @Test
    public void testInputForString(){
        assertTrue("empty", !input.equals("text"));
    }

    @Test
    public void testInputForNumber(){
        assertEquals(21,input.FibonacciCount(8));
    }

    @Test
    public void testInputForIDoNotKnow(){
        assertTrue("true",!input.toString().isEmpty());
    }


}
