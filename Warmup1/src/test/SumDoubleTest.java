package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SumDoubleTest {
    @Test
    public void if_both_are_same_number_return_double_of_their_sum(){
        assertEquals(sumDouble(2,2),8);
    }

    @Test
    public void if_both_are_not_same_number_return_sum(){
        assertEquals(sumDouble(1,2),3);
    }

    int sumDouble(int a, int b){
        int sum = a + b;

        if(a == b) return (sum) * 2 ;

        return sum;
    }
}
