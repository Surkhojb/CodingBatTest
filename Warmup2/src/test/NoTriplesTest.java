import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NoTriplesTest {

    @Test
    public void should_return_true_if_array_has_not_triples(){
        assertTrue(noTriples(new int[]{1,1,2,2,1}));
    }

    @Test
    public void should_return_false_if_array_has_triples(){
        assertFalse(noTriples(new int[]{1,1,1,2,1}));
    }
    private boolean noTriples(int[] arr){
        boolean result = checkForNoTriple(arr);
        return result;
    }

    private boolean checkForNoTriple(int[] arr) {
        int count = 0;
        for (int i=0; i < (arr.length-2); i++) {
            int first = arr[i];
            if (arr[i+1]==first && arr[i+2]==first){
                count++;
            }

        }
        return count == 0;
    }
}
