package ex33.Java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class ex33Test {
    @Test
    public void choicetest(){
        String[] c = {"1", "2", "3", "4", "5", "6"};
        assertEquals(true, (ex33.output(c) >= 0 && ex33.output(c) <= 5));

    }
}
