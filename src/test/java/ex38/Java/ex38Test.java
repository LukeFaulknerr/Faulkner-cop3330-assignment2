package ex38.Java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class ex38Test {
    @Test
    public void strTest(){
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 1; i < 9; i++){
            a.add(i);
        }
        ex38.filterEvenNumbers(a);

        for (int i = 2; i < 9; i+=2){
            b.add(i);
        }

        for (int i = 0; i < a.size(); i++){
            assertEquals(a.get(i), b.get(i));
        }
    }
}
