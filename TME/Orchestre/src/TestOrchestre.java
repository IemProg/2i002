public class TestOrchestre {
    public static void  main(String[] args){
        Instrument p1 = new Piano();
        Instrument g1 = new Guitare();
        Instrument t1 = new Trompette();

        Orchestre orchestre1 = new Orchestre(5, 0);
        orchestre1.ajouterInstrument(p1);
        orchestre1.ajouterInstrument(g1);
        orchestre1.ajouterInstrument(t1);

        orchestre1.jouer();
        //System.out.println(orchestre1.afficher());
    }
}
