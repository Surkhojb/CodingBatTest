import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Last2Test {

    @Test
    public void should_return_number_of_times_that_a_substring_lenght_2_apperas(){
        assertEquals(last2("hixxhi"),1);
    }

    private int last2(String str){
        if (str.length() < 2) return 0;

        int count = getCount(str);

        return count;
    }

    private int getCount(String str) {
        int count = 0;
        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(str.substring(str.length()-2))){
                count++;
            }
        }
        return count;
    }
}
