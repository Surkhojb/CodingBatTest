import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DoubleXTest {

    @Test
    public void should_return_true_if_the_string_has_two_x_together(){
        assertTrue(doubleX("abcxx"));
        assertTrue(doubleX("xxx"));
    }

    @Test
    public void should_return_false_if_the_string_has_not_two_x_together(){
        assertFalse(doubleX("xaxaxax"));
        assertFalse(doubleX("xaaxaaax"));
    }

    private boolean doubleX(String str){
        boolean result = getCount(str);
        return result;
    }

    private boolean getCount(String str) {
        if(str.length()<= 0) return false;
        if(str.indexOf("x") == -1) return false;

        int i = str.indexOf("x");
        String x = str.substring(i);
        return x.startsWith("xx");
    }
}
