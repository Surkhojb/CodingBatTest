import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juanjo Berenguer.
 * Email: surkhojb@gmail.com.
 * Date: 28/02/2018.
 */
public class MinCatTest {

    @Test
    public void should_return_the_strings_append_with_the_same_lenght(){
        assertEquals("loHi",minCat("Hello","Hi"));
        assertEquals("ellojava",minCat("Hello","java"));
        assertEquals("javaello",minCat("java","Hello"));
    }
    private static String minCat(String a,String b){
        int dif = 0;

        if(a.length() > b.length()){
            dif = a.length() - b.length();
            return a.substring(dif) + b;
        }else if(a.length() == b.length()){
            return a+b;
        }else{
            dif = b.length() - a.length();
            return a + b.substring(dif);
        }
    }
}
