import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class firstHalf {
    /*firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"*/
    @Test
    public void should_return_first_half_of_string(){
        assertEquals("Woo",firstHalf("WooHoo"));
    }

    private String firstHalf(String str){
        return str.substring(0,(str.length()/2));
    }
}
