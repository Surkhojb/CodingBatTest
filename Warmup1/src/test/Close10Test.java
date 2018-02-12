package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Close10Test {

    @Test
    public void should_return_first_if_is_the_only_close_10(){
        assertEquals(close10(8,13),8);
    }

    @Test
    public void should_return_second_if_is_the_only_close_10(){
        assertEquals(close10(13,8),8);
    }

    @Test
    public void should_return_0_if_both_are_not_close_10(){
        assertEquals(close10(7,13),0);
    }

    int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        }
        if (Math.abs(b - 10) < Math.abs(a - 10)) {
            return b;
        }
        return 0;
    }
}