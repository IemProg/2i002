public class Personne {
    private String nom;
    private String prénom;
    static int nbPersonnes;

    public Personne(String nom, String prénom){
        this.nom = nom;
        this.prénom = prénom;
        nbPersonnes++;
    }
    public String tostring(){
        return nom + " " + prénom;
    }
    public String getNom(){
        return nom; }
}
