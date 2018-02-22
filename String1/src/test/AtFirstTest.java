import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtFirstTest {

    @Test
    public void should_return_a_string_lenght_2_made_with_first_2_chars(){
        assertEquals("he" , atFirst("hello"));
    }

    @Test
    public void should_return_string_with_at_at_end_if_string_length_less_than_2(){
        assertEquals("h@",atFirst("h"));
    }

    private String atFirst(String str){
        if(str.length() == 1)
            return str + "@";
        else if(str.length() <= 0)
            return "@@";

        return str.substring(0,2);
    }
}
