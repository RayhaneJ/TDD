package cleanTest;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private String nom;
    private Map<String, String> translations;

    public Dictionary(String nom){
        this.nom = nom;
        translations = new HashMap<String, String>();
    }
    public String getName(){
        return nom;
    }

    public Boolean isEmpty(){
        return translations.isEmpty();
    }

    public void addTranslation(String original, String translated){
        translations.put(original, translated);
    }

    public String getTranslation(String original){
        return translations.get(original);
    }
}
