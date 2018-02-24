import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SeeColorTest {

    @Test
    public void return_the_color_name_if_start_with_it(){
        assertEquals("red",seeColor("redxx"));
        assertEquals("blue",seeColor("bluexx"));
        assertEquals("",seeColor("xxred"));
    }

    private String seeColor(String str){
        if(str.startsWith("blue"))
            return "blue";
        else if(str.startsWith("red"))
            return "red";
        else
            return "";
    }
}
