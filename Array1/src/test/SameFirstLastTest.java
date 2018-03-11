import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 11/03/2018.
 */
public class SameFirstLastTest {

    @Test
    public void should_return_true_if_first_and_last_number_are_the_same(){
        assertTrue(sameFirstLast(new int[]{1,2,1}));
        assertTrue(sameFirstLast(new int[]{1,2,3,1}));
    }

    @Test
    public void should_return_false_if_first_and_last_number_arent_the_same(){
        assertFalse(sameFirstLast(new int[]{1,2,3}));
    }

    private boolean sameFirstLast(int[] numbers){
        return numbers.length >= 1 && numbers[0] == numbers[numbers.length - 1];
    }
}
