package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HasTeenTest {

    @Test
    public void should_return_true_if_first_is_teen_number(){
        assertEquals(hasTeen(13,20,10),true);
    }

    @Test
    public void should_return_true_if_second_is_teen_number(){
        assertEquals(hasTeen(20,19,10),true);
    }

    @Test
    public void should_return_true_if_third_is_teen_number(){
        assertEquals(hasTeen(20,10,13),true);
    }

    @Test
    public void should_return_false_if_no_one_is_teen_number(){
        assertEquals(hasTeen(20,20,20),false);
    }


    private boolean hasTeen(int a,int b, int c){
        return ((a>= 13 && a<=19) ||(b>= 13 && b<=19) || (c>= 13 && c<=19));
    }
}
