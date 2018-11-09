public class Departement {
    private static int cmpt=1;
    private int NUM=1;
    private int NUM_DEPARTEMENT;
    private String LettreLettre;
    char Lettre1 = 'A', Lettre2 = 'A';


    /*
    après 999 AA 1, on a 1 AB 1
    après 999 AZ 1, on a 1 BA 1...
    */

    public Departement() {
        this.NUM_DEPARTEMENT = cmpt++;
    }

    public String getPlaque() {
        if (this.NUM <= 998) {
            NUM++;
        }else{
            if (Lettre1 <= 'Z') {
                Lettre1++;
                NUM = 1;
            } else {
                Lettre2++;
                NUM= 1;
            }
        }

        this.LettreLettre = "" + Lettre2 + Lettre1 + "";

        String S = this.NUM + " " + this.LettreLettre + " " + this.NUM_DEPARTEMENT;
        return S;
    }
}
