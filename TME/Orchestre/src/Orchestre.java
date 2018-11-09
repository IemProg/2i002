public class Orchestre {
    private Instrument tabInsts[];
    private int maxInst;
    private int courants;

    public Orchestre(int maxInst, int courants){
        tabInsts = new Instrument[maxInst];
        this.maxInst = maxInst;
        this.courants = courants;
    }

    public void ajouterInstrument(Instrument i){
        if (courants < maxInst){
          tabInsts[courants] = i;
          courants++;
          }
    }

    //Problem ci que on va redéfinier la méthode jouer();
    public void jouer(){
        for (int i=0; i<courants;i++){
            tabInsts[i].jouer();
        }

    }
    /*
    public String jouer(){
        String s = "";
        String[] tab2 ;

        for (int i=0; i<courants; i++){
            s += tabInsts[i].getClass()+" "+tabInsts[i].jouer()+" "+tabInsts[i].toString() + "\n";
        }
        return s;
    }
    */
}
