package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DelDelTest {
    @Test
    public void should_return_new_string_if_del_appears_at_index_1(){
        assertEquals(delDel("adelHello"),"aHello");
        assertEquals(delDel("adelbc"),"abc");
        assertEquals(delDel("adedbc"),"adedbc");
    }

    private String delDel(String str){

        if (str.length() >=4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        else return str;
    }
}
