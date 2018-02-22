import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoCharTest {

    @Test
    public void should_return_a_string_with_lenght_2_starting_at_the_given_index(){
        assertEquals("ja",twoChar("java",0));
    }

    private String twoChar(String str, int index){

    }
}
