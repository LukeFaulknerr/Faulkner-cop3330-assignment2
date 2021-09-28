package ex29.Java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ex29Test {
    @Test
    public void validCheck(){
        assertEquals(false, ex29.inputCheck("0"));
    }
}
