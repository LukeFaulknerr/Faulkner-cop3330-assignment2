package ex26.Java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ex26Test {
    @Test
    public void correctMonths(){
        assertEquals(70, PaymentCalculator.calculateMonthsUntilPaidOff(0.00032876712328767124, 5000, 100), .999999999999999);
    }
}
