public class Piano extends Instrument {

    public Piano(){
        super((double) (Math.random()*100), (double) (Math.random()*100));
    }

    public void jouer(){
        System.out.println("Piano joue! ");
    }
}
