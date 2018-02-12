import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Array123Test {

    @Test
    public void should_return_true_if_sequence_1_2_3_appears(){
        assertTrue(array123(new int[]{1,1,2,3,1}));
    }

    private boolean array123(int arr[]){
        boolean result = checkArray(arr);
        return result;
    }

    private boolean checkArray(int[] arr) {
        for (int i=0; i < (arr.length-2); i++) {
            if (arr[i]==1 && arr[i+1]==2 && arr[i+2]==3) return true;
        }
        return false;
    }
}
