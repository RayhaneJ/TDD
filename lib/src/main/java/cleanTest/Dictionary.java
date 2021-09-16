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
            List<String> arraylist1 = new ArrayList<String>();
            arraylist1.add(translatedWord);
            translations.put(original, arraylist1);
        }
        else {
            translations.get(original).add(translatedWord);
        }
    }

    public List<String> getMutliplesTranslations(String original){
        return translations.get(original);
    }
}
