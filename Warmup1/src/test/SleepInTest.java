package test;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SleepInTest {

    @Test
    public void sleepIn_not_workday_and_not_vacationday() {
        assertEquals(sleepIn(false, false), true);
    }

    @Test
    public void sleepIn_workday_and_not_vacation() {
        assertEquals(sleepIn(true, false), false);
    }

    @Test
    public void sleepIn_not_workday_and_in_vacationday() {
        assertEquals(sleepIn(false, true), true);
    }

    @Test
    public void sleepIn_workday_and_in_vacationday() {
        assertEquals(sleepIn(true, true), true);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation)
            return true;
        else
            return false;
    }
}
