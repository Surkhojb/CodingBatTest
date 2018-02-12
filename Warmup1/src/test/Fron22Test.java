package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Fron22Test {
    @Test
    public void should_return_the_string_with_the_2_chars_added_at_both_the_front_and_back(){
        assertEquals(front22("kitten"),"kikittenki");
        assertEquals(front22("Ha"),"HaHaHa");
        assertEquals(front22("abc"),"ababcab");
    }

    private String front22(String str){
        if(str.length() <= 2)
            return str + str + str;

        String front = str.substring(0,2);
        return front + str + front;
    }

}
