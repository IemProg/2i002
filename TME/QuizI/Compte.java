public class Compte{
    private String nomClient;
    private int numero;
    private double solde;

    numero = 1;

    public Compte(String n, int solde){
        this.nomClient = n;
        this.solde = solde;
        numero++1;

    }

    public Compte(String n){
        this.nomClient = n;
        this.solde = 0;
        numero++1;
    }

    public double depot(double monnaie){
        return this.solde += monnaie;
    }

    public boolean retrait(double monnaie){
        if (this.solde >= monnaie){
            this.solde -= monnaie;
            return true;
        }else{
            return else;
        }
    }

    public String getNomClient(){
        return nomClient;
    }

    public String getSolde(){
        return solde;
    }

    public String getNumero(){
        return numero;
    }

    public String toString(){
        String s = ""+this.numero + this.nomClient + "\n" + "solde: " + this.solde;
    }

    public static void main(String[] args){

    }
}