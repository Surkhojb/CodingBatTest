package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class In3050Test {

    @Test
    public void should_return_true_if_both_are_in_30_40(){
        assertEquals(in3050(30,31),true);
    }

    @Test
    public void should_return_true_if_both_are_in_40_50(){
        assertEquals(in3050(30,31),true);
    }

    @Test
    public void should_return_false_if_both_are_not_30_40_or_40_50(){
        assertEquals(in3050(30,41),false);
        assertEquals(in3050(20,21),false);
    }

    boolean in3050(int a, int b){
        boolean in30 = (a >= 30 && a <= 40 ) && (b>= 30 && b <= 40 );
        boolean in50 = (a >= 40 && a <= 50 ) && (b>= 40 && b <= 50 );

        return in30 || in50;
    }
}
