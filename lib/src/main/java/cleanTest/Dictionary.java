package cleanTest;

import java.util.*;

public class Dictionary {
    private String nom;
    private Map<String, List<String>> translations;

    public void clean(){
        translations.clear();
    }

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

    public void addTranslation(String original, String translatedWord){
        if(!translations.containsKey(original)) {
            List<String> translatedWords = new ArrayList<String>();
            translatedWords.add(translatedWord);

            List<String> reversoWords = new ArrayList<String>();
            reversoWords.add(original);

            translations.put(original, translatedWords);
            translations.put(translatedWord, reversoWords);
        }
        else {
            translations.get(original).add(translatedWord);

            List<String> reversoWords = new ArrayList<String>();
            reversoWords.add(original);
            translations.put(translatedWord, reversoWords);
        }
    }

    public List<String> getMutliplesTranslations(String original){
        return translations.get(original);
    }
}
