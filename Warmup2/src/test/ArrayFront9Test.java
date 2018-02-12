import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayFront9Test {
    @Test
    public void should_return_true_if_9_is_in_the_firts_4_elements_of_array(){
        assertTrue(arrayFront9(new int[]{1,2,9,3,4}));
    }

    @Test
    public void should_return_false_if_9_is_in_the_array_but_not_in_the_firts_4_elements(){
        assertFalse(arrayFront9(new int[]{1,2,2,3,9}));
    }

    @Test
    public void should_return_false_if_9_is_not_in_the_array(){
        assertFalse(arrayFront9(new int[]{1,2,2,3,4}));
    }

    private boolean arrayFront9(int[] arr){
        boolean result = checkFront(arr);
        return result;
    }

    private boolean checkFront(int[] arr) {
        int size = 4;
        if(arr.length < 4) size = arr.length;

        for(int i = 0; i<size; i++){
            if(arr[i] == 9)
                return true;
        }
        return false;

    }
}
