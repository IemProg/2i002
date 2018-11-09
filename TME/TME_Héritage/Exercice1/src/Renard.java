public class Renard extends Animal {
    private static int cmpt = 1;
    private int id;

    public Renard(int x, int y) {
        super(x, y, "r");
        this.id = cmpt;
        cmpt++;
    }

    public String afficher(){
        String s = "Type:" + this.type + ", Position: (" + this.x + "," + this.y + "), et de ID:" + this.id ;
        return s;
    }

    public String toString() {
        return String.format("r%02d", id);
    }
}
