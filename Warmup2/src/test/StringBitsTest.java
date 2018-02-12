import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringBitsTest {

    @Test
    public void should_return_a_new_string_with_every_other_char_starting_with_the_first(){
        assertEquals(stringBits("Hello"),"Hlo");
        assertEquals(stringBits("Hi"),"H");
        assertEquals(stringBits("Heeololeo"),"Hello");
    }

    private String stringBits(String str){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i+=2){
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
