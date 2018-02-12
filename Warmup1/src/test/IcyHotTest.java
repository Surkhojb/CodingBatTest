package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IcyHotTest {

    @Test
    public void should_return_true_if_one_is_less_than_0_and_the_other_is_greater_than_100(){
        assertEquals(icyHot(120,-1),true);
        assertEquals(icyHot(-1,120),true);
    }

    @Test
    public void should_return_false_if_one_is_greatest_than_0_and_the_other_is_greater_than_100(){
        assertEquals(icyHot(2,120),false);
        assertEquals(icyHot(120,2),false);
    }
    public boolean icyHot(int temp1, int temp2) {
        return ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0));
    }
}
