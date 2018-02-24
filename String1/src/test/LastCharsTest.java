import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LastCharsTest {

    @Test
    public void return_new_string_made_of_last_chars(){
        assertEquals("ls",lastChars("last","chars"));
    }

    private String lastChars(String a,String b){
        if(a.length()<= 0 && b.length() <= 0)
            return "@@";
        else if(a.length() > 0 && b.length()<= 0)
            return a.substring(0,1) + "@";
        else if(a.length() <= 0)
            return "@" + b.substring(b.length() - 1);
        else
            return a.substring(0,1) + b.substring(b.length() - 1);

        }
}
