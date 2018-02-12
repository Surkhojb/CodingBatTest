import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringTimesTest {

    @Test
    public void should_return_n_times_the_string(){
        assertEquals(stringTime("Hi",2),"HiHi");
        assertEquals(stringTime("Hi",3),"HiHiHi");
        assertEquals(stringTime("Hi",1),"Hi");
    }

    private String stringTime(String str,int n){
        String result = "";

        for (int i = 0 ; i < n; i++)
            result += str;

        return result;

    }
}
