import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AltPairsTest {

    @Test
    public void should_return_an_string_made_of_chars_at_index_if_array_lengh_more_than_1(){
        assertEquals(altPairs("kitten"),"kien");
        assertEquals(altPairs("Chocolate"),"Chole");
        assertEquals(altPairs("CodingHorror"),"Congrr");
    }

    private String altPairs(String str){
        if(str.length() <= 1) return str;

        String result = getNewString(str);
        return result;
    }

    private String getNewString(String str) {
        StringBuilder result = new StringBuilder();
        // i = 0 , 4 , 8 ....
        for(int i = 0; i < str.length(); i+=4) {
            //i + 2
            int end = i + 2;
            //if end is more than length, just took the lenght for keep inside the array.
            if (end > str.length()) {
                end = str.length();
            }
            //append substring from value of i and end of the array ( can be i + 2 or just the end of the string)
            result.append(str.substring(i, end));
        }
        return result.toString();
    }
}
