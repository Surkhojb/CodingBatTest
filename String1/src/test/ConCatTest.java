import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConCatTest {

    @Test
    public void should_concat_two_strings(){
        assertEquals("dogcat",conCat("dog","cat"));
        assertEquals("abcat",conCat("abc","cat"));
        assertEquals("pigdoggy",conCat("pig","doggy"));
    }

    private String conCat(String a, String b){
        String s = "";
        if(a.length()<=0)
            return s = b;
        else if(b.length()<= 0)
            return s = a;

        else if(a.substring(a.length()-1).equals(b.substring(0,1)))
            return s = a + b.substring(1);
        else
            return s = a + b;

    }
}
