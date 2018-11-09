public class Cabine {
    private int volume;
    private String couleur;

    public Cabine(int volume, String couleur) {
        this.volume = volume;
        this.couleur = couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Cabine clone(){
        return new Cabine(this.volume, this.couleur);
    }

    @Override
    public String toString() {
        return "Cabine{" +
                "volume=" + volume +
                ", couleur='" + couleur + '\'' +
                '}';
    }

}
