package cleanTest;

import org.junit.Test;

import java.util.Enumeration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DictionaryTest {
    @Test
    public void testDictionaryName(){
        Dictionary dictionary = new Dictionary("MonDico");
        assertThat(dictionary.getName(), equalTo("MonDico"));
    }

    @Test
    public void testDictionaryEmptyCount(){
        Dictionary dictionary = new Dictionary("MonDico");
        assertThat(dictionary.isEmpty(), equalTo(true));
    }
}
