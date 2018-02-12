package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParrotTroubleTest {

    @Test
    public void parrot_is_not_talking_return_no_trouble(){
        assertEquals(parrotTrouble(false,3),false);
    }

    @Test
    public void parrot_is_talking_not_between_7_and_20_return_trouble(){
        assertEquals(parrotTrouble(true,21),true);
    }

    @Test
    public void parrot_is_talking_between_7_and_20_return_no_trouble(){
        assertEquals(parrotTrouble(true,16),false);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return ((hour < 7 || hour > 20 ) && talking);
    }
}
