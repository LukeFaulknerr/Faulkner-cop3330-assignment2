package ex28.Java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import Ex28.Java.ex28;
import org.junit.Test;

public class ex28Test {
    @Test
    // Just a logic checker, really. no good way to do it with scanned in nums wit the same logic
    public void addCheck(){
        assertEquals(45, ex28.adder(9));
    }
}
