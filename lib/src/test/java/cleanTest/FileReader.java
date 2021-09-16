package cleanTest;

import java.util.Arrays;
import java.util.List;

public class FileReader {
    public FileReader(){

    }

    public List<String> loadTranslations(File file){
        if(file.error())
            return Arrays.asList("Error");
        if(file.isEmpty())
            return Arrays.asList("Empty");
        if(file.exist())
            return Arrays.asList("Dont exist");
        if(file.hasOnlyAName())
            return Arrays.asList("Has only a name");

        return file.getLine();
    }
}
