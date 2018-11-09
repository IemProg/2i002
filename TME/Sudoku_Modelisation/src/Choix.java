public class Choix {
    public boolean tab [] = new boolean[];
    public int nbLibre;
    public static final int LENGTH = tab.length;


    public Choix(int n){
        tab = new boolean[n];
        for (int i=0; i <tab.length ; i++){
            tab[i] = true;
        }
    }

    // TODO: 10/11/18
    // Choix(Choix choix);
    public Choix(Choix choix){
        return new choix;
    }

    public boolean estLibre(int i){
        if (tab[i] == false){
            return false;
        }
        return true;
    }

    public int getNbLibre(){
        return nbLibre;
    }

    void setLibre(int i){
        tab[i] = true;
        nbLibre++;
    }

    void setOccupe(int i){
        tab[i] = false;
        nbLibre--;
    }

    //[false,true,false,true,false,false], getNext(0) renvoie 1, getNext(1) renvoie 1,
    // getNext(2) renvoie 3, getNext(4) renvoie -1);

    int getNext(int i){
        for (int j = i; j < LENGTH; i++)
            if (tab[j]) return j;
             else return -1;
    }

    //Choix intersection(Choix)
    // TODO: 10/11/18
    public Choix intersection(Choix n){
        boolean [] aTab = new boolean[n.tab.length];
        for (int i=0; i<LENGTH; i++){
            if(this.tab[i] && n.tab[i]){
                aTab[i] = true;
            }else{
                aTab[i] = false;
            }
            return aTab;
        }
    }

    public String toString(){
        String s = "Tableu situation: ";
        for (int i = 0; i <tab.length; i++) {
            s += tab[i] + " ";
        }
        return s;
    }

}