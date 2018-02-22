import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheEndTest {

    @Test
    public void should_return_string_lenght_1_from_its_front_or_string_lenght_from_back_if_its_false(){
        assertEquals("H",theEnd("Hello",true));
        assertEquals("o",theEnd("Hello",false));
    }

    private String theEnd(String str,boolean front){
        return front ? str.substring(0,1) : str.substring(str.length() - 1 );
    }
}
