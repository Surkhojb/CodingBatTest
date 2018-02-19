import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeOutWordTest {

    @Test
    public void should_return_word_inside_out(){
        assertEquals("<<Yay>>",makeOutWord("<<>>","Yay"));
    }
    private String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }

}
