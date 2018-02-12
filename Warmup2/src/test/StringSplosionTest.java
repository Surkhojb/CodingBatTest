import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringSplosionTest {
    @Test
    public void should_return_new_string(){
        assertEquals(stringSplosion("Code"),"CCoCodCode");
        assertEquals(stringSplosion("abc"),"aababc");
        assertEquals(stringSplosion("ab"),"aab");
    }

    private String stringSplosion(String str){
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            result.append(str.substring(0,i+1));
        }
        return result.toString();
    }
}
