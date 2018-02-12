package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MonkeyTroubleTest {

    @Test
    public void both_monkey_are_smiling(){
        assertEquals(monkeyTrouble(true,true),true);
    }

    @Test
    public void both_monkey_are_not_smiling(){
        assertEquals(monkeyTrouble(false,false),true);
    }

    @Test
    public void first_one_monkey_are_smiling(){
        assertEquals(monkeyTrouble(false,true),false);
    }

    @Test
    public void second_one_monkey_are_smiling(){
        assertEquals(monkeyTrouble(true,false),false);
    }

    boolean monkeyTrouble(boolean aSmile,boolean bSmile){
        if(aSmile && bSmile) return true;
        else if(!aSmile && !bSmile) return true;
        else  return false;
    }
}
