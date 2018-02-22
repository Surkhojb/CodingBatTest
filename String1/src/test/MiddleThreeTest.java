import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MiddleThreeTest {

    @Test
    public void should_return_string_length_3_from_its_middle(){
        assertEquals("and",middleThre("Candy"));
        assertEquals("and",middleThre("and"));
    }

    private String middleThre(String str){
        if(str.length() <= 3)
            return str;
        return str.substring(str.length()/2 - 1, str.length()/2 + 2);
    }
}
