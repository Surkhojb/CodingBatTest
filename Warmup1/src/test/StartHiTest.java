package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StartHiTest {

    @Test
    public void should_return_true_if_setence_start_with_hi(){
        assertEquals(startHi("hi hello"),true);
        assertEquals(startHi("hi"),true);
    }

    @Test
    public void should_return_false_if_setence_not_start_with_hi(){
        assertEquals(startHi("hello"),false);
        assertEquals(startHi("hello hi"),false);
    }


    private boolean startHi(String str){
        return str.startsWith("hi");
    }
}
