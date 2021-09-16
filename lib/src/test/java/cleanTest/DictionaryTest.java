package cleanTest;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Enumeration;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class DictionaryTest {
    private Dictionary dictionary;

    @Before
    public void initialize(){
        dictionary = new Dictionary("MonDico");
    }

    @Test
    public void testDictionaryName(){
        assertThat(dictionary.getName(), equalTo("MonDico"));
    }

    @Test
    public void testDictionaryEmpty(){
        assertThat(dictionary.isEmpty(), equalTo(true));
    }

    @Test
    public void testDictionaryNotEmpty(){
        dictionary.addTranslation("ensemble", "together");
        assertThat(dictionary.isEmpty(), equalTo(false));
    }

    @Test public void testOneTranslation() {
        dictionary.addTranslation("ensemble", "together");
        assertThat(dictionary.getTranslation("ensemble"), equalTo("together"));
    }

    @Test public void testMultiplesTranslation() {
        dictionary.addTranslation("ensemble", Arrays.asList("together", "assembly"));
        assertThat(dictionary.getTranslation("ensemble"), containsInAnyOrder("together", "assembly"));
    }
}
