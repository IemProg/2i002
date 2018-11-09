public class Cellule {
    private int age;

    public Cellule(){
        this.age = 0;
    }

    public Cellule(boolean vie){
        if (vie == true){
            this.age = 0;
        }else {
            this.age = -1;
        }
    }

    public void viellir(boolean b){
        if (b == false){
            this.mourir();
        }else{
            this.age +=1;
        }
    }

    public boolean vivante(){
        if(this.age != -1){ return true;}
        return false;
    }

    void mourir(){
        this.age = -1;
    }

    public void naitre(){
        this.age = 0;
    }

    public int[] getColor(){
        if (this.vivante()){
            int[] output = {1, 1, 1};
            return output;
        }else {
            int[] output = {0, 0, 0};
            return output;
        }
    }

    //TODO
    public boolean  etatSuivant(int x, int y){
        return false;
    }

    //TODO
    public void etatSuivant(){
        return ;
    }

    public String toString(){
        if (vivante() == true){
            return "*";
        }
        return ".";
    }
}
