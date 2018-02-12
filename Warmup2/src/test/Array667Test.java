import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Array667Test {
    @Test
    public void should_return_1_if_the_number_of_times_that_two_6_are_next_is_1() {
        assertEquals(array667(new int[]{6, 6, 2}), 1);
        assertEquals(array667(new int[]{6, 6, 2, 6}), 1);

    }

    @Test
    public void should_return_2_if_the_number_of_times_that_two_6_are_next_is_2() {
        assertEquals(array667(new int[]{6, 6,1,6, 6}), 2);
        assertEquals(array667(new int[]{6, 6, 2, 6, 6}), 2);

    }

    @Test
    public void should_return_1_if_the_number_of_times_that_6_and_7_are_next_is_1(){
        assertEquals(array667(new int[]{6, 7, 2, 6}), 1);
    }

    @Test
    public void should_return_2_if_the_number_of_times_that_6_and_7_are_next_is_2(){
        assertEquals(array667(new int[]{6, 7, 6, 7}), 2);
    }

    private int array667(int[] arr) {
        int count = checkArray(arr);
        return count;
    }

    private int checkArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < (arr.length - 1); i++) {
            if (arr[i] == 6 && arr[i + 1] == 6) {
                count++;
            } else if (arr[i] == 6 && arr[i + 1] == 7) {
                count++;
            }
        }
        return count;
    }
}
