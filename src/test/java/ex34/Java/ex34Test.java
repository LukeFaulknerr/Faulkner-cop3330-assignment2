package ex34.Java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.ArrayList;

public class ex34Test {
    @Test
    public void deleteTest(){
        ArrayList<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");

        assertEquals(5, a.size());
        ex34.remove(a, "2");
        assertEquals(4, a.size());
    }
}
