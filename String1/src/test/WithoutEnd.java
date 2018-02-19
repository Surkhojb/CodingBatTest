import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WithoutEnd {

    @Test
    public void should_return_string_without_first_and_last_char(){
        assertEquals("ell",withoutEnd("Hello"));
    }

    private String withoutEnd(String str){
        return str.substring(1,(str.length() - 1));
    }
}
