import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 28/02/2018.
 */
public class WithoutXTest {
    @Test
    public void should_return_string_without_x_at_start_and_end(){
        assertEquals("Hi",withoutX("xHix"));
        assertEquals("Hi",withoutX("xHi"));
        assertEquals("Hxi",withoutX("Hxix"));
    }

    private String withoutX(String str){
        if (str.length() > 0 && str.charAt(0) == 'x') {
            str =  str.replaceAll("^.", "");
        }
        if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
            str =  str.replaceAll(".$", "");
        }
        return str;
    }
}
