import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import org.junit.Assert;

public class TestAnagram {

    Anagram input;

    @Before
    public void createInput(){
        input=new Anagram();
    }

    @Test
    public void testTwoStringsAreSame(){
        input.string1="abc";
        input.string2="cba";
        assertNotEquals(input.string1,input.string2);
    }

//    @Test
//    public void testTwoStrings(){
//        input.string1="abc";
//        input.string2="cba";
//        assertEquals(input.string1 != input.string2);
//    }
//
//    private void assertEquals(boolean b) {
//    }

    @Test
    public void testIsPernutationTrue() {
        assertTrue(input.validAnagram("abc", "cba"));
        assertTrue(input.validAnagram("geeksforgeeks", "forgeeksgeeks"));
    }

    @Test
    public void testIsPernutationFalse() {
        assertFalse(input.validAnagram("abc", "caa"));
        assertFalse(input.validAnagram("anagramm", "marganaa"));
    }


}