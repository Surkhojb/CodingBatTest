import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Without2Test {

    @Test
    public void should_return_a_string_without_2_first_character_if_they_appears_at_the_end(){
        assertEquals("lloHe",without2("HelloHe"));
        assertEquals("",without2("Hi"));
        assertEquals("HelloHi",without2("HelloHi"));

    }

    private String without2(String str){
        if(str.length() <2)
            return str;
        else if(str.startsWith(str.substring(str.length() - 2)))
            return str.substring(2);
        else
            return str;
    }
}
