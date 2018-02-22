import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WithoutEnd2Test {

    @Test
    public void should_return_string_without_both_first_and_last_character(){
        assertEquals("ell",withoutEnd2("Hello"));
        assertEquals("",withoutEnd2("ab"));
    }
    private String withoutEnd2(String str){
        if(str.length() <=2)
            return "";

        return str.substring(1,str.length()-1);
    }
}
