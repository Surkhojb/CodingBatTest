import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExtraEndTest {

    @Test
    public void should_new_string_made_of_3_copies_of_the_last_2_chars(){
        assertEquals("HiHiHi",extraEnd("Hi"));
    }

    private String extraEnd(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 3; i ++)
            sb.append(str.substring(str.length() - 2));
        return sb.toString();
    }
}
