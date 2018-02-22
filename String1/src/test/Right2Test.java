import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Right2Test {

    @Test
    public void should_return_string_with_two_last_characters_moved_to_start(){
        assertEquals("loHel",left2("Hello"));
        assertEquals("Hi",left2("Hi"));
    }
    private String left2(String str){
        if(str.length()<=2)
            return str;

        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
    }
}
