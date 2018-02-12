package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Front3Test {
    @Test
    public void should_return_a_new_string_wich_is_3_copies_of_the_front(){
        assertEquals(front3("JavJavJav"),"JavJavJav");
        assertEquals(front3("a"),"aaa");
        assertEquals(front3(""),"");
    }

    String front3(String str){
        if(str.length() < 3)
            return str + str + str;

        String s = str.substring(0,3);
        return s + s + s;
    }
}
