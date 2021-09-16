package cleanTest;

public class Dictionary {
    private String nom;

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
