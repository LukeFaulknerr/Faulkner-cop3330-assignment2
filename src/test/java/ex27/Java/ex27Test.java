package ex27.Java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ex27Test {
    @Test
    public void fNameCheck(){
        assertEquals(ex27.firstFilled(""), true);
        assertEquals(ex27.firstLength("J"), false);
    }
    @Test
    public void lNameCheck(){
        assertEquals(ex27.lastFilled("Hello"), false);
        assertEquals(ex27.lastLength("UPLAAAAAAAAaaaaaaaaaaaaaaaaaaaa"), true);
    }
    @Test
    public void ZIPCheck(){
        assertEquals(ex27.ZIPNumCatch("12345"), true);
    }

    @Test
    public void IDCheck(){
        assertEquals(ex27.IDFormat("QQ-2009"), true);
    }
}
