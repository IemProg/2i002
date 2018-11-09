public class Emplacement{
    public Carte carte;
    public String nom;

    //First Constructor
    public Emplacement(String nom){
        this.nom = nom;
    }

    //Second Constructor
    public Emplacement(String nom, Carte carte){
            this.carte = carte;
            this.nom = nom;
    }
    public String toString(){
        String output = this.nom + " : " + this.carte;
        return output;
    }

    public boolean estVide(){
        if (carte == null){
            return true;
        }else{
            return false;
        }
    }

    public boolean poser(Carte car){
        if (estVide() == true){
            this.carte = car;
            return true;
        }else{
            return false;
        }
    }

    public Carte enlever(){
        if( this.carte == null)
            return null;
        Carte save;
        save = new Carte(carte.nom);
        carte = null;
        return save;

    }

    public static void main(String[] args){
        System.out.println("Creating an emplacement");
        Emplacement mon_emplacement = new Emplacement("Imad_Emplacement");
        System.out.println("--------------");

        System.out.println("Creating a carte with Imad as a name");
        Carte MaCarte = new Carte("Imad");

        System.out.println("--------------");
        System.out.println("Poser la carte Imad ");
        System.out.println(mon_emplacement.poser(MaCarte));

        System.out.println(mon_emplacement.toString());
        //System.out.println(mon_emplacement.nom);
        //System.out.println(mon_emplacement.carte);

        System.out.println("--------------");
        System.out.println("Enlever la carte!");
        System.out.println(mon_emplacement.enlever());
    }
}