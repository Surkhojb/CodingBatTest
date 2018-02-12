import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountXX {

    @Test
    public void should_return_number_of_xx_as_pair_in_the_string(){
        assertEquals(countXX("abcxx"),1);
        assertEquals(countXX("xxx"),2);
        assertEquals(countXX("xxxx"),3);
    }

    private int countXX(String str){
        int count = getCount(str);
        return count;
    }

    private int getCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx"))
                count++;
        }
        return count;
    }
}
