public class Trompette extends Instrument {
    public Trompette(){
        super((double) (Math.random()*100), (double) (Math.random()*100));
    }

    public void jouer(){
        System.out.println("Trompette joue! ");
    }
}
