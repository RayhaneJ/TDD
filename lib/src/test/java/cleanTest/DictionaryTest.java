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
    public void testDictionaryEmpty(){
        Dictionary dictionary = new Dictionary("MonDico");
        assertThat(dictionary.isEmpty(), equalTo(true));
    }

    @Test
    public void testDictionaryNotEmpty(){
        Dictionary dictionary = new Dictionary("MonDico");
        dictionary.addTranslation("ensemble", "together");
        assertThat(dictionary.isEmpty(), equalTo(false));
    }

    @Test public void testOneTranslation() {
        Dictionary dictionary = new Dictionary("MonDico");
        dictionary.addTranslation("ensemble", "together");
        assertThat(dictionary.getTranslation("ensemble"), equalTo("together"));
    }
}
