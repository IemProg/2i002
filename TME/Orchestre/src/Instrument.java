public class Instrument {
    private double poids, prix;

    public Instrument(double poids, double prix) {
        this.poids = poids;
        this.prix = prix;
    }

    public void jouer(){};
    public String toString() {
        return "Instrument{" +
                "poids=" + poids +
                ", prix=" + prix +
                '}';
    }
}
