package ex24.App;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ex24Test
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertEquals(1, 2);
    }

    @Test
    public void anagramTrue(){
        boolean t = true;
        String s = "note";
        String y = "tone";
        assertEquals(ex24.isAnagram(s, y), t);
    }

}
