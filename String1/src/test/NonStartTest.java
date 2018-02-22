import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NonStartTest {

    @Test
    public void should_return_new_string_without_first_char_of_each_string(){
        assertEquals("ellohere",nonStart("Hello","There"));
    }
    private String nonStart(String a,String b){

        return a.substring(1) + b.substring(1);
    }
}
