package test;

import com.sun.deploy.util.StringUtils;
import org.junit.Test;



import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class StringETest {

    @Test
    public void should_return_true_if_the_number_of_characthers_is_1(){
        assertTrue(stringE("Hello"));
    }

    @Test
    public void should_return_true_if_the_number_of_characthers_is_2(){
        assertTrue(stringE("Heello"));
    }
    @Test
    public void should_return_true_if_the_number_of_characthers_is_3(){
        assertTrue(stringE("Heelle"));
    }

    @Test
    public void should_return_false_if_the_number_of_characthers_is_more_than_3(){
        assertFalse(stringE("Heelele"));
    }

    @Test
    public void should_return_true_if_the_number_of_characthers_is_less_1(){
        assertFalse(stringE(""));
    }
    private boolean stringE(String str){
        int n = countNumberOfCharacters(str);
        return n >= 1 && n<= 3 ;
    }

    private int countNumberOfCharacters(String str){
        int number = 0;
        if(str.length() <= 0)
            return number;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == 'e')
                number++;
        }
        return number;
    }
}
