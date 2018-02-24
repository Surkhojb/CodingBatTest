import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastTwoTest {

    @Test
    public void should_return_string_with_last_two_characters_swapped(){
        assertEquals("codign",lastTwo("coding"));
    }

    private String lastTwo(String str){
        if(str.length()<=1) return str;
        return str.substring(0,str.length() - 2)  + str.substring(str.length() - 1)
                + str.substring(str.length() - 2, str.length() - 1 );
    }
}
