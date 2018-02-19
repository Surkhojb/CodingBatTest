import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ComboStringTest {

    @Test
    public void should_return_new_string_with_form_short_long_short(){
        assertEquals("hiHellohi",comboString("Hello","hi"));
    }

    private String comboString(String a,String b){
     if(a.length() > b.length())
         return b + a + b;
     else
         return a + b + a;
    }
}
