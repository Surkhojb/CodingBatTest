package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDiff21 {

    @Test
    public void test_diff_under_21(){
        assertEquals(diff21(19),2);
    }

    @Test
    public void test_diff_over_21(){
        assertEquals(diff21(25),8);
    }

    int diff21(int n){
        int diff = Math.abs(21 - n);

        if(n > 21) return diff * 2;

        return diff;
    }
}
