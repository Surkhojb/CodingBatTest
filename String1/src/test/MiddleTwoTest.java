import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleTwoTest {

    @Test
    public void should_return_a_new_string_made_of_middle_two_chars(){
        assertEquals("od",middleTwo("code"));
    }

    private String middleTwo(String str){
        StringBuilder strBuilder = new StringBuilder();
        int middle = str.length()/ 2;
        return strBuilder.append(str.charAt(middle-1)).append(str.charAt(middle)).toString();
    }
}
