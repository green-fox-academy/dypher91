import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class CharSeqVsStringUnit {
    @Test
    public void givenUsingString_whenInstantiatingString_thenWrong() {
        CharSequence firstString = "bealdung";
        String secondString = "bealdung";

        assertNotEquals(firstString, secondString);
    }
}
