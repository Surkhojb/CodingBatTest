package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StartOzTest {

    @Test
    public void should_return_oz_when_string_contains_both_at_first_2_chars(){
        assertEquals(startOz("ozzymandias"),"oz");
    }

    @Test
    public void should_return_o_when_string_contains_o_at_first_2_chars(){
        assertEquals(startOz("oxx"),"o");
    }

    @Test
    public void should_return_z_when_string_contains_z_at_first_2_chars(){
        assertEquals(startOz("bzo"),"z");
    }

    private String startOz(String str){
        String s = "";

        if (str.length() >= 1 && str.charAt(0)=='o') {
            s += str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1)=='z') {
            s += str.charAt(1);
        }

        return s;
    }
}
