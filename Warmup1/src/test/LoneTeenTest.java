package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoneTeenTest {

    @Test
    public void should_return_true_if_first_is_teen_number(){
        assertEquals(loneteen(13,99),true);
    }

    @Test
    public void should_return_true_if_second_is_teen_number(){
        assertEquals(loneteen(21,13),true);
    }

    @Test
    public void should_return_false_if_both_are_teen_number(){
        assertEquals(loneteen(13,13),false);
    }

    private boolean loneteen(int a,int b){
      return ((a>= 13 && a<=19) && !(b>= 13 && b<=19)) || (!(a>= 13 && a<=19) &&  (b>= 13 && b<=19));
    }
}
