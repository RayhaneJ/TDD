package cleanTest;

import java.util.List;

public class File implements IFile{
    boolean exist;
    boolean isEmpty;
    boolean hasOnlyAName;
    boolean error;

    @Override
    public boolean exist() {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean hasOnlyAName() {
        return false;
    }

    @Override
    public boolean error() {
        return false;
    }

    @Override
    public List<String> getLine() {
        return null;
    }


}
