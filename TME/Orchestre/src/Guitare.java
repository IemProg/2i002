public class Guitare extends Instrument {
    public Guitare(){
        super((double) (Math.random()*100), (double) (Math.random()*100));
    }

    public void jouer(){
        System.out.println("Guitare joue! ");
    }
}
