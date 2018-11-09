public class Carte{
    public String nom;

    public Carte(){
        this.nom = "Valet";
        }

    public Carte(String nom){
        this.nom = nom;
        }

    public String toString(){
        String s = this.nom;
        return s;
        }


        public static void main(String[] args){
        Carte n1 = new Carte();
        Carte n2 = new Carte("Imad");

        //System.out.println(n1);
        //System.out.println(n2);
        }

}