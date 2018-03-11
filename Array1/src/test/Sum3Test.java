import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 11/03/2018.
 */
public class Sum3Test {

    @Test
    public void should_return_the_sum_of_elements(){
        assertEquals(6,sum3(new int[]{1,2,3}));
        assertEquals(18,sum3(new int[]{5,11,2}));
        assertEquals(7,sum3(new int[]{7,0,0}));
    }

    private int sum3(int[] nums){
        return IntStream.of(nums).sum();
    }
}
