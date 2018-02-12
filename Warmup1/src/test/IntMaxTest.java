package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntMaxTest {

    @Test
    public void should_return_the_first_if_this_number_is_the_largest(){
        assertEquals(intMax(3,2,1),3);
    }

    @Test
    public void should_return_the_second_if_this_number_is_the_largest(){
        assertEquals(intMax(1,3,2),3);
    }

    @Test
    public void should_return_the_third_if_this_number_is_the_largest(){
        assertEquals(intMax(1,2,3),3);
    }


    int intMax(int a,int b, int c){
        return Math.max(Math.max(a,b),c);
    }
}
