public class Roue {
    private int diametre;

    public Roue(int diametre) {
        this.diametre = diametre;
    }

    public Roue() {
        this(60);
    }

    public Roue clone(){
        return new Roue(this.diametre);
    }

    @Override
    public String toString() {
        return "Roue{" +
                "diametre=" + diametre +
                '}';
    }
}
