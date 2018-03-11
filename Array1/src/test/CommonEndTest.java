import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 11/03/2018.
 */
public class CommonEndTest {

    @Test
    public void should_return_true_if_both_arrays_have_the_same_first_element_or_the_same_last_element(){
        assertTrue(commonEnd(new int[]{1,2,3},new int[]{7,3}));
        assertTrue(commonEnd(new int[]{1,2,3},new int[]{1,3}));
    }

    @Test
    public void should_return_false_if_both_arrays_havent_the_same_first_element_or_the_same_last_element(){
        assertFalse(commonEnd(new int[]{1,2,3},new int[]{7,2}));
        assertFalse(commonEnd(new int[]{3,2,3},new int[]{1,2}));
    }

    private boolean commonEnd(int[] a, int[] b){

        return  a[0] == b[0] || a[a.length - 1] == b[b.length -1];
    }
}
