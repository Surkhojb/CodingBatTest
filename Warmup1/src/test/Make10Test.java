package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Make10Test {
    @Test
    public void if_first_number_is_10_return_true(){
        assertEquals(make10(10,2),true);
    }

    @Test
    public void if_second_number_is_10_return_true(){
        assertEquals(make10(2,10),true);
    }

    @Test
    public void if_both_sum_10_return_true(){
        assertEquals(make10(8,2),true);
    }

    @Test
    public void if_no_one_is_10_and_sum_is_not_10_return_false(){
        assertEquals(make10(3,2),false);
    }

    boolean make10(int a,int b){
        return ((a == 10 || b == 10) || a + b == 10);
    }
}
