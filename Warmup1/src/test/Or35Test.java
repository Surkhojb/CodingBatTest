package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Or35Test {
    @Test
    public void should_return_false_if_number_is_negative(){
        assertEquals(or35(-4),false);
    }

    @Test
    public void should_return_true_if_number_is_multiple_of_3(){
        assertEquals(or35(3),true);
    }

    @Test
    public void should_return_true_if_number_is_multiple_of_5(){
        assertEquals(or35(3),true);
    }

    @Test
    public void should_return_false_if_number_is_not_multiple_of_3_or_multiple_of_5(){
        assertEquals(or35(8),false);
    }

    private boolean or35(int n) {
        return ((n % 3 == 0) || (n % 5 == 0));

    }
}
