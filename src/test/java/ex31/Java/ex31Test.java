package ex31.Java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ex31Test {
    @Test
    public void THRCheck(){
        assertEquals(138, ex31.targetHeartRateCalculator(65, 22, .55));
    }
}
