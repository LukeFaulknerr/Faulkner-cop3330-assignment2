package ex36.Java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ex36Test {

    private ArrayList<Integer> x = new ArrayList<Integer>();
    @Before
    public void init(){
        x.add(100);
        x.add(200);
        x.add(1000);
        x.add(300);
    }
    @Test
    public void averageTest(){
        assertEquals(400, ex36.average(x), 0.3);
    }
    @Test
    public void minTest(){
        assertEquals(100, ex36.min(x), 0);
    }

    @Test
    public void maxTest(){
        assertEquals(1000, ex36.max(x), 0);
    }

    @Test
    public void stdTest(){
        assertEquals(353.55, ex36.std(x), 0.01);
    }

}
