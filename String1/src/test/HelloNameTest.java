import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloNameTest {

    @Test
    public void should_return_string_with_hello_and_name(){
        assertEquals(helloName("Bob"),"Hello Bob!");
        assertEquals(helloName("Alice"),"Hello Alice!");
        assertEquals(helloName("X"),"Hello X!");
    }

    private String helloName(String str) {
        return String.format("Hello %s!",str);
    }
}
