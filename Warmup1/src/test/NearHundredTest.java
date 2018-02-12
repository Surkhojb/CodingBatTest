package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NearHundredTest {

    @Test
    public void if_number_is_10_of_100_return_true(){
        assertEquals(nearHundred(90),true);
        assertEquals(nearHundred(91),true);
        assertEquals(nearHundred(89),false);
        assertEquals(nearHundred(111),false);
    }

    @Test
    public void if_number_is_10_of_200_return_true(){
        assertEquals(nearHundred(190),true);
        assertEquals(nearHundred(191),true);
        assertEquals(nearHundred(189),false);
        assertEquals(nearHundred(211),false);

    }

    boolean nearHundred(int n){
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }
}
