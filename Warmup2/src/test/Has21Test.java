import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Has21Test {

    /*FOR PASS WEBSITE TEST I SHOULDED CHANGE MY CODE TO:
      public boolean has271(int[] nums) {
           for (int i=0; i < (nums.length-2); i++) {
              int val = nums[i];
              if (nums[i+1] == (val+5) &&              // the "7" check
              Math.abs(nums[i+2] - (val-1)) <= 2) {  // the "1" check
              return true;
           }
            return false;
      }
      */

    @Test
    public void should_return_true_if_the_pattern_271_is_in_the_array(){
        assertTrue(has271(new int[]{1, 2, 7, 1}));
        assertTrue(has271(new int[]{2, 7, 1}));
        assertTrue(has271(new int[]{2, 7, -1}));
    }

    @Test
    public void should_return_false_if_the_pattern_271_is_not_in_the_array(){
        assertFalse(has271(new int[]{1, 2, 8, 1}));
        assertFalse(has271(new int[]{3, 8, 2}));
        assertFalse(has271(new int[]{2, 7, 3}));
        assertFalse(has271(new int[]{2, 7, 4}));
        assertFalse(has271(new int[]{2, 7, -2}));
        assertFalse(has271(new int[]{4, 5, 3, 8, 0}));
        assertFalse(has271(new int[]{2, 7, 5, 10, 4}));
        assertFalse(has271(new int[]{2, 7, -2, 4, 9, 3}));
        assertFalse(has271(new int[]{2, 7, 5, 10, 1}));
        assertFalse(has271(new int[]{2, 7, -2, 4, 10, 2}));
        assertFalse(has271(new int[]{1, 1, 4, 9, 0}));
        assertFalse(has271(new int[]{1, 1, 4, 9, 4, 9, 2}));

    }

    @Test
    public void should_return_false_if_the_size_of_the_array_is_less_than_3(){
        assertFalse(has271(new int[]{2,-7}));
    }
    //THIS CODE PASS TEST IN INTELLIJ BUT NOT IN WEBSITE.
    private boolean has271(int[] arr) {
        if(arr.length <= 2) return false;
        //Create a new array without negative integers
        int nums[] = convertToAbsArray(arr);

        return checkIf271(nums);
    }

     private boolean checkIf271(int[] arr) {
        for (int i = 0; i < (arr.length - 2); i++) {
            if (arr[i] == 2 && arr[i + 1] == 7 && arr[i + 2] == 1) {
                return true;
            }
        }
        return false;
    }

    private int[] convertToAbsArray(int[] arr) {
        int[] nums = arr;

        for(int i = 0; i < nums.length; i++){
            nums[i] = Math.abs(arr[i]);
        }
        return nums;
    }
}
