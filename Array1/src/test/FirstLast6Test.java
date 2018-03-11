import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 11/03/2018.
 */

public class FirstLast6Test {

    @Test
    public void should_return_true_if_start_or_end_with_6(){
        assertTrue(firstLast6(new int[] {1,2,6}));
        assertTrue(firstLast6(new int[] {6,1,2,6}));
        assertTrue(firstLast6(new int[] {6,1,2,3}));
    }

    @Test
    public void should_return_false_if_doesnt_start_or_end_with_6(){
        assertFalse(firstLast6(new int[] {1,2,1}));
        assertFalse(firstLast6(new int[] {12,6,1,2,4}));
    }

    private boolean firstLast6(int[] nums){
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }
}
