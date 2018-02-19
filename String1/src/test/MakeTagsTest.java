import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeTagsTest {

    @Test
    public void should_return_a_string_with_html_tag(){
        assertEquals("<i>Yai</i>",makeTags("i","Yai"));
        assertEquals("<i>Hello</i>",makeTags("i","Hello"));
        assertEquals("<cite>Yai</cite>",makeTags("cite","Yai"));
    }

    private String makeTags(String tag, String word) {
        return String.format("<%s>%s</%s>",tag,word,tag);
    }

}
