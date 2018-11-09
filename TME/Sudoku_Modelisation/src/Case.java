public class Case {
    public int nombre;
    public boolean modifiable;
    public Choix col;
    public Choix line;
    public Choix bloc;

    public Case(Choix col, Choix line, Choix bloc){
        this.col = col;
        this.line = line;
        this.bloc = bloc;
    }

    public int getNombre() {
        return nombre;
    }

    public boolean getModifiable() {
        return modifiable;
    }

    //TODO:
    public boolean estVide(){
        if (//){
            return true;
        }
        return false;
    }

    public void setModifiable(boolean n){
        this.modifiable = n;
    }

    // TODO: 10/11/18
    public Choix getChoix(){
        retutn col.intersection(line.intersection(bloc));
    }

    // TODO: 10/11/18
    public void supprime(){
    }


    //TODO:
    public boolean setNombre(int n){
        if (this.modifiable == true){
            for(){
                this.nombre = n;
                return true;
            }
        }
        return false;
    }


    public String toString(){
        String s;
        if (this.estVide()){
            s = " ";
        }else{
            s = ""+ nombre+1;
        }
        return s;
    }
}
