package ex32.Java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
public class ex32Test {
    @Test
    public void difSelectorCheck(){
        int min = 1, max = 100;
        int ran = ex32.numSelector(2);
        assertEquals(true, (1 <= ran && ran <=100));
    }
}
