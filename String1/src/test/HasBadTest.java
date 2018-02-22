import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class HasBadTest {

    @Test
    public void should_return_true_if_starting_at_index_0_or_1_with_bad(){
        assertTrue(hasBad("badxx"));
        assertTrue(hasBad("xbadxx"));
    }

    @Test
    public void should_return_false_if_not_starting_at_index_0_or_1_with_bad(){
        assertFalse(hasBad("xxbadxx"));
    }
    private boolean hasBad(String str){
        return str.startsWith("bad") || str.startsWith("bad",1);
    }
}
