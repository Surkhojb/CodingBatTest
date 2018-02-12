package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class In1020Test {

    @Test
    public void should_return_true_if_first_is_in_range_10_to_20(){
        assertEquals(in1020(12, 99),true);
    }

    @Test
    public void should_return_true_if_second_is_in_range_10_to_20(){
        assertEquals(in1020(21, 12),true);
    }

    @Test
    public void should_return_false_if_no_one_is_in_range_10_to_20(){
        assertEquals(in1020(8, 99),false);
    }

    private boolean in1020(int a,int b){
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }
}
