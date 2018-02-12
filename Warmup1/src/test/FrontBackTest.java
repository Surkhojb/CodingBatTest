package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FrontBackTest {

    @Test
    public void should_return_a_new_string_with_first_and_last_chars_exchanged(){
        assertEquals(frontBack("code"),"eodc");
        assertEquals(frontBack("eodc"),"code");
        assertEquals(frontBack("a"),"a");
        assertEquals(frontBack("ab"),"ba");
    }

    String frontBack(String str){
        if(str.length() <= 1)
            return str;

        char lastToFront = str.charAt(str.length() - 1);
        char frontToLast = str.charAt(0);

        return lastToFront + str.substring(1, str.length() - 1) + frontToLast;
    }
}
