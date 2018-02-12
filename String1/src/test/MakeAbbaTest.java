import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeAbbaTest {

    @Test
    public void should_return_first_and_second_string_and_second_and_first_all_together(){
        assertEquals(makeAbba("ho","la"),"holalaho");
    }
    private String makeAbba(String str,String str2){
        return String.format("%s%s%s%s",str,str2,str2,str);
    }
}
