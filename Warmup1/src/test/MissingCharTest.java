package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MissingCharTest {

    @Test
    public void test_if_return_a_uptaded_string_removing_character_at_position(){
        assertEquals(missingChar("kitten",1),"ktten");
        assertEquals(missingChar("kitten",0),"itten");
        assertEquals(missingChar("kitten",4),"kittn");
    }

    String missingChar(String str,int c){
        StringBuilder uptadetStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            if(i != c)
                uptadetStr.append(str.toCharArray()[i]);
        }
        return uptadetStr.toString();
    }
}
