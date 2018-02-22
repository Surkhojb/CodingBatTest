import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class NTwiceTest {

    @Test
    public void should_return_string_made_of_the_first_and_last_n_chars(){
        assertEquals("Helo",nTwice("Hello",2));
        assertEquals("Choate",nTwice("Chocolate",3));
    }

    private String nTwice(String str,int n){
        return str.substring(0,n) + str.substring(str.length()- n);
    }
}
