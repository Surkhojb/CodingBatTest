import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Left2Test {

    @Test
    public void should_return_string_with_two_first_characters_moved_to_end(){
        assertEquals("lloHe",left2("Hello"));
    }
    private String left2(String str){
        return str.substring(2) + str.substring(0,2);
    }
}
