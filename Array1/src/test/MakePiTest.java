import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 11/03/2018.
 */
public class MakePiTest {

    @Test
    public void should_return_an_int_array_containing_first_3_digits_of_pi(){
        final int[] arrayPi = new int[] {3,1,4};
        assertTrue(Arrays.equals(arrayPi,makePi()));
    }

    private int[] makePi(){
        return new int[]{3,1,4};
    }
}
