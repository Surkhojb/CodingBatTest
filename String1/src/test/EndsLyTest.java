import org.junit.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class EndsLyTest {

    @Test
    public void should_return_true_if_ends_with_ly(){
        assertTrue(endsLy("oddly"));
    }

    @Test
    public void should_return_false_if_not_ends_with_ly(){
        assertFalse(endsLy("oddy"));
    }

    private boolean endsLy(String str){
        return str.endsWith("ly");
    }
}
