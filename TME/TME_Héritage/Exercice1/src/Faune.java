public class Faune{
    private int TAILLE;
    private int NBANIMAUX;
    private Animal[] tab;

    public Faune(int NBANIMAUX, int TAILLE) {
        this.NBANIMAUX = NBANIMAUX;
        this.TAILLE = TAILLE;

        tab = new Animal[NBANIMAUX];
        int k = NBANIMAUX / 3;
        //TODO: Sometimes it doesn't generate same nbr of animals due to random nbrs conflicts

        for (int i = 0; i < NBANIMAUX; i += 3) {
            tab[i] = new Poule((int) (Math.random() * (TAILLE)), (int) (Math.random() * (TAILLE)));
            tab[i + 1] = new Renard((int) (Math.random() * (TAILLE)), (int) (Math.random() * (TAILLE)));
            tab[i + 2] = new Vipere((int) (Math.random() * (TAILLE)),(int) (Math.random() * (TAILLE)));
        }
    }


    public int getIndiceAnimalLePlusProche(Animal requete){
        double dist_min=Double.POSITIVE_INFINITY;
        int index = -1;

        for (int i=0; i<tab.length; i++){
            if (tab[i]== requete){
                continue;
            }
            if(tab[i]== null){
                continue;
            }
            if(tab[i].distance(requete) < dist_min){
                dist_min = i;
            }
        }
        return (int) dist_min;
    }

    //TODO: at home destance
    public void etatDeLaFaune(){
        int indice_ani;
        for (int i=0; i<tab.length; i++){
            //indice_ani = tab[]
        }
    }

    public String terrain(){
        String[][] terr = new String[TAILLE][TAILLE];
        String s = "";

        for (int i=0; i<TAILLE; i++){
            for (int k =0; k<TAILLE; k++){
                terr[i][k] = "  *  ";
            }
        }

        for (int i=0; i < NBANIMAUX; i++) {
                terr[tab[i].getX()][tab[i].getY()] = " "+tab[i].toString()+" ";
        }

        for (int i=0; i< TAILLE; i++){
            for (int k=0; k<TAILLE; k++){
                s+=terr[i][k];
            }
            s+="\n";
        }
        return s;
    }
}