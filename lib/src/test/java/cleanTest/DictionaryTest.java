package cleanTest;

import org.junit.Test;

import java.util.Dictionary;
import java.util.Enumeration;

import static org.hamcrest.MatcherAssert.assertThat;

public class DictionaryTest {
    @Test
    public void testDictionaryName(){
        assertThat(dict.getName(), equalTo("Example"));
    }
}
