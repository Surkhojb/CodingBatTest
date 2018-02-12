import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringMatchTest {
    @Test
    public void should_return_3_if_the_substring_appear_3_times_in_both(){
        assertEquals(stringMatch("xxcaazz","xxbaaz"),3);
    }

    @Test
    public void should_return_2_if_the_substring_appear_2_times_in_both(){
        assertEquals(stringMatch("abc","abc"),2);
    }

    @Test
    public void should_return_1_if_the_substring_appear_1_times_in_both(){
        assertEquals(stringMatch("ab","ab"),1);
    }

    @Test
    public void should_return_0_if_the_substring_doesnt_appear_in_both(){
        assertEquals(stringMatch("ba","ab"),0);
    }

    private int stringMatch(String str,String str2){
        int count = getSubStringNumbOfMatch(str,str2);
        return count;
    }

    private int getSubStringNumbOfMatch(String str, String str2) {
        int countTimes = 0;
        int minSize = Math.min(str.length(),str2.length());

        for(int i = 0; i < minSize - 1; i++){
            if(str.substring(i ,i+2).equals(str2.substring(i,i+2)))
                countTimes++;
        }
        return countTimes;
    }
}
