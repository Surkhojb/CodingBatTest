import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FrontAgainTest {

    @Test
    public void should_return_true_if_2_first_chars_appear_at_the_end(){
        assertTrue(frontAgain("edited"));
        assertTrue(frontAgain("ed"));
    }
    @Test
    public void should_return_false_if_2_first_chars_not_appear_at_the_end(){
        assertFalse(frontAgain("edit"));
    }

    private boolean frontAgain(String str){
        if(str.length()<= 1)
            return false;

        return str.substring(0,2).equals(str.substring(str.length() -2));
    }
}
