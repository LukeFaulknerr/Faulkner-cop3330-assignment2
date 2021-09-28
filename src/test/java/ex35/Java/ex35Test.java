package ex35.Java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import java.util.ArrayList;

public class ex35Test {
    @Test
    public void arrChoiceTest(){
        ArrayList<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        a.add("3");
        a.add("4");
        a.add("5");

        assertEquals(true, ex35.chooseWinner(a) < a.size());
    }
}
