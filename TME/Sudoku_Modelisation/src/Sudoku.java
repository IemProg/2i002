public class Sudoku {
    public int n;
    public Case[][] aCase;
    public Choix col;
    public Choix line;
    public Choix bloc;

    public Choix caseVide;

    //pour une case de coordonée (i,j), le bloc correspondant sera i/Math.sqrt(n)+Math.sqrt(n)*(j/Math.sqrt(n))).

    public Sudoku(int n){
        aCase = new Case[n][n];
        col = new Choix(n);
        line = new Choix(n);
        bloc = new Choix(n);

    }

    public boolean getModifiable(int i, int j){
        return aCase[i][j].getModifiable();
    }

    public Choix getChoix(int i, int j){
        return aCase[i][j].getChoix();
    }

    public int getNombre(int x, int y){
        return aCase[x][y].getNombre();
    }

    public boolean setNombre(int x, int y, int i){
        return aCase[x][y].setNombre(i);
    }

    public void supprime(int x, int y){
        aCase[x][y].supprime();
    }

    public int getX(int id){
        return id%n;
    }

    public int getY(int id){
        return id/n;
    }

    public int getId(int i, int j){
        return i+j*n;
    }

    public Choix getChoix(int id){
        return this.getChoix(this.getX(id), this.getY(id));
    }

    boolean getModifiable(int id){
        return this.getModifiable(this.getX(id), this.getY(id));
    }

    public int getNombre(int id){
        return this.getNombre(this.getX(id), this.getY(id));
    }

    public boolean setNombre(int id,int i){
        return this.setNombre(this.getX(id), this.getY(id), i);
    }

    public void supprime(int id){
        this.supprime(this.getX(id), this.getY(id));
    }

    public boolean setInitial(int x, int y, int n){
        this.setNombre(x, y, n);
        return aCase[x][y].modifiable = false;
    }

    //TODO:
    public Choix getCaseVide(){
    }

    //TODO:
    public int getAlea(){
        int alt = Math.random()*getNbLibre();
    }

    //TODO:
    public static Sudoku getSudoku(int n, int d){
        return Sudoku(n);
    }

}
