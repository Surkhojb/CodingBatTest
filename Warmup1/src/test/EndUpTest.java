package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EndUpTest {

    @Test
    public void should_return_string_with_3_last_chars_in_upper_case(){
        assertEquals(endUp("Hello"),"HeLLO");
    }

    @Test
    public void should_return_string_in_upper_case(){
        assertEquals(endUp("hi"),"HI");
    }

    private String endUp(String str){
        if(str.length() < 3)
            return str.toUpperCase();

        return str.substring(0,str.length() -3) + str.substring(str.length() - 3).toUpperCase();
    }
}
