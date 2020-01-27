import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {

    @Test
    public void testSum() {
        System.out.println("sum");
        Integer x = 15;
        Integer y = 15;
        Integer expResult = 30;
        Integer result = Calculator.sum(x, y);
        assertEquals(expResult, result);

        x = 10;
        y = 20;
        result = Calculator.sum(x, y);
        assertEquals(expResult, result);

    }
    @Test
    public void testSumNull() {
        assertEquals(null, Calculator.sum(15, null));
        assertEquals(null, Calculator.sum(null, 15));
        assertEquals(null, Calculator.sum(null, null));
        assertNull(Calculator.sum(null, null));
    }

    @Test
    public void addLargetNum() {
        Integer result = Calculator.sum(Integer.MAX_VALUE , Integer.MIN_VALUE);
        assertNotNull(result);
        Integer exp = -1;
        assertEquals(exp, result);
    }

}
