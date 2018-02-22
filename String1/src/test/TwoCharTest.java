import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoCharTest {

    @Test
    public void should_return_a_string_with_lenght_2_starting_at_the_given_index(){
        //assertEquals("ja",twoChar("java",0));
        //assertEquals("ja",twoChar("java",3));
        assertEquals("va",twoChar("java",2));
        assertEquals("lo",twoChar("Hello",3));
    }

    private String twoChar(String str, int index){
        System.out.println("String lenght " + str.length());
        if( (index + 2 > str.length()) || index < 0)
            return str.substring(0,2);
        else
            return Character.toString(str.charAt(index)) + Character.toString(str.charAt(index + 1 ));
    }
}
