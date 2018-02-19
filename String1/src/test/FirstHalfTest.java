import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FirstHalfTest {

    @Test
    public void should_return_first_half_of_string(){
        assertEquals("Woo",firstHalf("WooHoo"));
    }

    private String firstHalf(String str){
        return str.substring(0,(str.length()/2));
    }
}
