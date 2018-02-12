package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BackAroundTest {

    @Test
    public void should_return_an_string_with_last_char_added_at_the_fron_and_back(){
        assertEquals(backAround("cat"),"tcatt");
        assertEquals(backAround("a"),"aaa");
        assertEquals(backAround("Hello"),"oHelloo");
    }

    String backAround(String str){
        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str + lastChar;
    }
}
