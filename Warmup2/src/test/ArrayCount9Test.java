import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayCount9Test {

    @Test
    public void should_return_1_if_the_array_has_3_9(){
        assertEquals(arrayCount9(new int[] {1,2,9}),1);
    }

    @Test
    public void should_return_2_if_the_array_has_2_9(){
        assertEquals(arrayCount9(new int[] {1,9,9}),2);

    }

    @Test
    public void should_return_3_if_the_array_has_2_9(){
        assertEquals(arrayCount9(new int[] {1,9,9,2,4,9}),3);

    }

    @Test
    public void should_return_0_if_the_array_has_not_9(){
        assertEquals(arrayCount9(new int[] {1,2,3,2,4,4}),0);

    }


    private int arrayCount9(int[] arr){
        int count = getCount(arr);
        return count;
    }

    private int getCount(int[] arr) {
        int count = 0;
        for(int i : arr)
            if(i == 9) count++;
        return count;

    }
}
