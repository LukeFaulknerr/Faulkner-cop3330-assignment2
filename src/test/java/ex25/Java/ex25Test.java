package ex25.Java;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ex25Test {
    @Test
    public void pwCheck(){
        assertEquals(1, ex25.passwordValidator("12345"));
        assertEquals(2, ex25.passwordValidator("abcde"));
        assertEquals(3, ex25.passwordValidator("asdfd23aaaaa4"));
        assertEquals(4, ex25.passwordValidator("abcd@#2345"));
    }
}
