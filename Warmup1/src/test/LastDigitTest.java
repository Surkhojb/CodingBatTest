package test;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LastDigitTest {

    @Test
    public void should_return_true_if_both_have_same_last_digit(){
        assertTrue(lastDigit(3,13));
    }

    @Test
    public void should_return_false_if_both_have_not_same_last_digit(){
        assertFalse(lastDigit(37,13));
    }

    boolean lastDigit(int a, int b){
        return (a%10 == b%10);

    }
}
