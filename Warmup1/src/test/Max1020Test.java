package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Max1020Test {

    @Test
    public void should_return_first_if_this_number_is_larger_and_is_in_range_10_20(){
        assertEquals(max1020(19,11),19);
    }

    @Test
    public void should_return_second_if_this_number_is_larger_and_is_in_range_10_20(){
        assertEquals(max1020(11,19),19);
    }

    @Test
    public void should_return_0_if_no_one_is_in_the_range(){
        assertEquals(max1020(5,21),0);
    }

    int max1020(int a, int b){
        if(b > a){
            int aux = a;
            a = b;
            b = aux;
        }

        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }
}
