package ex37.Java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ex37Test {
    @Test
    public void lengthTest(){
        String pw = ex37.generateRandomPassword(5, 2, 3);
        assertEquals(true, pw.length() > 5);
    }
}
