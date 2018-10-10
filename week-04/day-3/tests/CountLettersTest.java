import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountLettersTest {
    CountLetters test;


    @Before
    public void createString(){
        test=new CountLetters();
    }


    @Test
    public void testCountForString(){

        assertEquals(3,test.countIndex());

    }
}
