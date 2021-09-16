package cleanTest;

import java.util.List;

public interface IFile {
    boolean exist();
    boolean isEmpty();
    boolean hasOnlyAName();
    boolean error();
    List<String> getLine();
}
