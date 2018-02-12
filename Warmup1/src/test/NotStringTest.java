package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NotStringTest {
    @Test
    public void if_string_has_not_return_same_string(){
        assertEquals(notString("not bad"),"not bad");
    }

    @Test
    public void if_string_hasnt_not_return_string_with_not_at_frong(){
        assertEquals(notString("x"),"not x");
    }

    public String notString(String str) {
        String not = "not";

        if(str.startsWith(not))
            return str;
        else
            return not + " " + str;

    }
}
