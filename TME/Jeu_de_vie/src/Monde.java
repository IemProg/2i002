public class Monde {
    public Cellule [][] tabCells;
    public int nbGen;


    public Monde(int x, int y, double seuil){
        tabCells = new Cellule[x][y];
        double random = Math.random();

        for (int i = 0; i <tabCells.length; i++){
            for (int k=0; k < tabCells[i].length; k++){
                tabCells[i][k] = new Cellule(random > seuil);
            }
        }
    }

    public Monde(double seuil){
        this(20, 20, seuil);
    }

    public int getX(){
        return this.tabCells.length;
    }
    public int getY(){
        return this.tabCells[0].length;
    }

    public int getNbGen(){
        return this.nbGen;
    }

    public Cellule get(int x, int y){
        return tabCells[x][y];
    }

    public int nbVoisins(int x, int y){
        int counter = 0;
        for (int i= 0; i<tabCells.length ; i++) {
            for (int k = 0; k < tabCells[i].length; k++) {
                if (((x + i) % i == 0) && ((y + k) % k == 0)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public Monde clone(){
        return new Monde();
    }

    //TODO:
    public boolean  etatSuivant(int x, int y){
        return false;
    }

    //TODO
    public void etatSuivant(){
        return ;
    }

    public String toString(){
        String s = "Numéro de la génération courante est: " + nbGen + ", tableu est: " + tabCells.toString();
        return s;
    }

    public static void main(String [] args){
        Monde monde1 = new Monde(0.5);
        System.out.println(monde1.toString());
        System.out.println(monde1.get(10, 10));
        System.out.println(monde1.nbGen);
    }

}
