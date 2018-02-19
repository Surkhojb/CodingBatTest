import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FirstTwoTest {

    @Test
    public void should_return_two_first_char_of_the_string(){
        assertEquals("He",firstTwo("Hello"));
        assertEquals("ab",firstTwo("ab"));
    }

    private String firstTwo(String str){
        if(str.length() <2) return str;

        return str.substring(0,2);
    }
}
