public class Tracteur {
    private Cabine cabine;
    private Roue roue1, roue2, roue3, roue4;

    public Tracteur(Cabine cabine, Roue roue1, Roue roue2, Roue roue3, Roue roue4) {
        this.cabine = cabine;
        this.roue1 = roue1;
        this.roue2 = roue2;
        this.roue3 = roue3;
        this.roue4 = roue4;
    }

    public void peindre(String couleur) {
        this.cabine.setCouleur(couleur);
    }
    public Tracteur clone(){
        return new Tracteur(this.cabine.clone(), this.roue1.clone(), this.roue2.clone(), this.roue3.clone(), this.roue4.clone());
    }

    @Override
    public String toString() {
        return "Tracteur{" +
                "cabine=" + cabine +
                ", roue1=" + roue1 +
                ", roue2=" + roue2 +
                ", roue3=" + roue3 +
                ", roue4=" + roue4 +
                '}';
    }
}
