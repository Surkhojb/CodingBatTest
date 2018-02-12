package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MixStartTest {

    @Test
    public void should_return_true_if_start_with_mix(){
        assertEquals(mixStart("mix snacks"),true);
    }

    @Test
    public void should_return_true_if_has_ix(){
        assertEquals(mixStart("pix snacks"),true);
    }

    @Test
    public void should_return_false_if_start_is_not_mix_or_ix(){
        assertEquals(mixStart("piz snacks"),false);
    }

    private boolean mixStart(String str){
        if(str.length() <= 2)
            return false;

        return str.startsWith("mix") || str.substring(1,3).contains("ix");
    }
}
