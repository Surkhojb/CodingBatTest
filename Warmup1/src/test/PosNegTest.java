package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PosNegTest {
    @Test
    public void if_first_is_positive_and_second_is_negative_and_negative_is_false_return_true(){
        assertEquals(posNeg(1,-1,false),true);
    }

    @Test
    public void if_first_is_positive_and_second_is_negative_and_negative_is_true_return_false(){
        assertEquals(posNeg(1,-1,true),false);
    }

    @Test
    public void if_first_is_negative_and_second_is_positive_and_negative_is_false_return_true(){
        assertEquals(posNeg(1,-1,false),true);
    }

    @Test
    public void if_first_is_negative_and_second_is_positive_and_negative_is_true_return_false(){
        assertEquals(posNeg(1,-1,true),false);
    }

    @Test
    public void if_first_is_negative_and_second_is_negative_and_negative_is_false_return_false(){
        assertEquals(posNeg(-1,-1,false),false);
    }

    @Test
    public void if_first_is_negative_and_second_is_negative_and_negative_is_true_return_true(){
        assertEquals(posNeg(-1,-1,true),true);
    }


    boolean posNeg(int a, int b, boolean negative){
       if(negative)
           return a < 0 && b < 0;
       else
           return ((a < 0 && b > 0) || (a > 0 && b < 0));

   }
}
