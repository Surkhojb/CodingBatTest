import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringXTest {

    @Test
    public void should_return_string_with_x_only_at_start_and_end(){
        assertEquals(stringX("xxHxix"),"xHix");
        assertEquals(stringX("abxxxcd"),"abcd");
        assertEquals(stringX("xabxxxcdx"),"xabcdx");
    }

    private String stringX(String str){
        if(str.length() <= 1) return str;

        String front = str.substring(0,1);
        String end = str.substring(str.length()-1);
        String body = str.substring(1,str.length() -1).replace("x","");

        return front + body + end;

    }
}
