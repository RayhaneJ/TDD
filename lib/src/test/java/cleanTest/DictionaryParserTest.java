package cleanTest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DictionaryParserTest {

    @Test public void testEmptyFile(){
        IFile mockObject = mock(IFile.class);
        when(mockObject.getLine()).thenReturn(Arrays.asList("test"));

    }
}
