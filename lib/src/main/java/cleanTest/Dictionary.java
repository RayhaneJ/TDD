package cleanTest;

import java.util.Map;

public class Dictionary {
    private String nom;
    private Map<String, String> translations;

    public Dictionary(String nom){
        this.nom = nom;
    }
    public String getName(){
        return nom;
    }

    public Boolean isEmpty(){
        return false;
    }

    public void addTranslation(String original, String translated){

    }

    public String getTranslation(String original){
        return "together";
    }
}
