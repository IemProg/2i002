public class Jeu{
    private Emplacement gauche, milieu, droit;
    private Carte carte_gauche, carte_milieu, carte_droit;
    public Carte cible;

    public Jeu(){
        carte_gauche = new Carte("Gauche");
        carte_milieu = new Carte("Milieu");
        carte_droit = new Carte("Droit");
        cible = new Carte("cible");

        gauche = new Emplacement("Gauche", carte_gauche);
        milieu = new Emplacement("Milieu", carte_milieu);
        droit = new Emplacement("Droit", cible);

    }
    public String toString(){
        String output =
                "Emplacement gauche " + gauche.toString() + "\n" +
                    "Emplacement milieu " + milieu.toString() + "\n" +
                        "Emplacement droit " + droit.toString();
        return output;
    }

    void echanger(Emplacement a, Emplacement b){
        Carte ca = a.enlever();
        Carte cb = b.enlever();
        a.poser(cb);
        b.poser(ca);
    }

    void echanger(int i, int j){
        if (i+j == 1){
            echanger(gauche, milieu);
        }else if(i+j == 2){
            echanger(gauche, droit);
        }else{
            echanger(milieu, droit);
        }
    }

   boolean choisir(Emplacement a){
       if (a.carte.nom == cible.nom){
           return true;
       }
       return false;

       //return a.carte.equals(this.cible);
   }


   boolean choisir(int i) {
       if (i == 0)
           return choisir(gauche);
       if (i == 1)
           return choisir(milieu);
       return choisir(droit);
   }

    void melanger() {
        int random1 = (int) Math.random() * 3;
        int random2 ;
        do {
            random2 = (int) (Math.random() * 3);
        } while (random2 == random1);
        echanger(random1, random2);
    }

    void melanger(int n){
        for (int i =0; i < n+1; i++){
            melanger();
            }
    }
}