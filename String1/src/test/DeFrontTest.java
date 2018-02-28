import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 28/02/2018.
 */
public class DeFrontTest {

    @Test
    public void should_return_string_without_2_first_except_if_first_is_a_and_second_b(){
        assertEquals("llo",deFront("Hello"));
        assertEquals("va",deFront("java"));
        assertEquals("aay",deFront("away"));
        assertEquals("abc",deFront("abc"));
        assertEquals("by",deFront("xby"));
    }

    private String deFront(String str){
        if(str.charAt(0) == 'a' && str.charAt(1) == 'b'){
            return str;
        }else if(str.charAt(0) == 'a'){
            return str.substring(0,1) + str.substring(2);
        }else if(str.charAt(1) == 'b'){
            return str.substring(1,2) + str.substring(2);
        }else{
            return str.substring(2);
        }

    }
}
