public class Intervale{
    public int debut, fin;

    public Intervale(int debut, int fin){
        this.debut = debut;
        this.fin = fin;
    }

    public Intervale(){
        this((int) (Math.random()*101), (int) (Math.random()*101));
        while (fin < debut){
            fin = (int) (Math.random()*101);
        }
    }

    public String toString(){
        String s = "["+ this.debut + ","+this.fin + "]";
        return s;
    }
    public static void main(String[] a) {
        Intervale new_int = new Intervale();
        System.out.println(new_int.toString());
    }
}