import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FrontTimesTest {

    @Test
    public void should_return_the_front_of_string_n_times(){
        assertEquals(frontTime("Chocolate",2),"ChoCho");
        assertEquals(frontTime("Chocolate",3),"ChoChoCho");
        assertEquals(frontTime("Abc",3),"AbcAbcAbc");

    }

    @Test
    public void should_return_the_string_n_times_if_string_is_less_than_3(){
        assertEquals(frontTime("Ab",2),"AbAb");
        assertEquals(frontTime("Ab",3),"AbAbAb");

    }

    private String frontTime(String str,int n){
        return getFront(str,n);

    }
    private String getFront(String str, int n){
        int frontSize = 3;
        String front;
        String result = "";

        if(str.length() <= 2) frontSize = str.length();
        front = str.substring(0,frontSize);

        for(int i = 0; i < n; i++)
            result += front;

        return result;
    }
}
