import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 28/02/2018.
 */
public class WithoutX2Test {
    @Test
    public void should_return_string_without_x_at_start_and_end(){
        assertEquals("Hi",without2X("xHi"));
        assertEquals("Hi",without2X("Hxi"));
        assertEquals("Hi",without2X("Hi"));
        assertEquals("Hi",without2X("xxHi"));
    }

    private String without2X(String str){
        if(str.length() == 1 && str.charAt(0) == 'x')
            return "";

        if(str.length() >= 2) {
            if(str.charAt(0) == 'x' && str.charAt(1) == 'x') {
                return str.substring(2);
            } else if(str.charAt(0) == 'x') {
                return str.substring(1);
            } else if(str.charAt(1) == 'x') {
                return str.charAt(0) + str.substring(2);
            }
        }

        return str;
    }
}
