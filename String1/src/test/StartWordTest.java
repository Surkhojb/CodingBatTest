import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 28/02/2018.
 */

public class StartWordTest {

    @Test
    public void should_return_the_word_if_the_string_start_with_this_word(){
        assertEquals("hi",startWord("hippo","hi"));
    }

    @Test
    public void should_return_the_fron_of_string_if_the_word_is_not_at_the_start_of_the_string(){
        //assertEquals("h",startWord("hippo","i"));
        assertEquals("hip",startWord("hippo","xip"));
    }

    private String startWord(String str,String word){
        if(word.length() > str.length())
            return "";

        if(str.startsWith(word)){
            return word;
        }else if(str.substring(1).contains(word.substring(1))){
            return str.substring(0,word.length());
        }else{
            return "";
        }
    }
}
