package test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EndNthTest {

    @Test
    public void should_return_a_new_string_starting_at_char_0_and_every_nth_char(){
        assertEquals(everyNth("Miracle",2),"Mrce");
        assertEquals(everyNth("abcdefg",2),"aceg");
        assertEquals(everyNth("abcdefg",3),"adg");
    }

    private String everyNth(String str,int n){
        StringBuilder result = new StringBuilder();
        for (int i=0; i<str.length(); i = i + n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
