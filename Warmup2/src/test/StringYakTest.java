import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringYakTest {
    @Test
    public void should_return_string_without_yak(){
        assertEquals(stringYak("yakpak"),"pak");
        assertEquals(stringYak("pakyak"),"pak");
        assertEquals(stringYak("yak123ya"),"123ya");
        assertEquals(stringYak("y"),"y");
        assertEquals(stringYak("ya"),"ya");
        assertEquals(stringYak("yak"),"");
    }

    private String stringYak(String str){
        if(str.length() <= 2) return str;
        String result = str.replace("yak","");
        return result;
    }
}
