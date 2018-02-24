import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExtraFontTest {

    @Test
    public void should_return_a_string_with_3_copies_of_2_first_characters(){
        assertEquals("HeHeHe",extraFont("Hello"));
    }

    private String extraFont(String str){
        if(str.length() <=2) return str+str+str;

        return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
    }
}
