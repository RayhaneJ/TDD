package cleanTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private String nom;
    private Map<String, List<String>> translations;

    public Dictionary(String nom){
        this.nom = nom;
        translations = new HashMap<String, List<String>>();
    }
    public String getName(){
        return nom;
    }

    public Boolean isEmpty(){
        return translations.isEmpty();
    }

    public void addTranslation(String original, List<String> translatedWords){
        translations.put(original, translatedWords);
    }

    public List<String> getTranslation(String original){
        return translations.get(original);
    }
}
