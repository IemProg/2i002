public class TestTracteur {
    public static void main(String[] args) {
        Roue roue_gr1 = new Roue(120);
        Roue roue_gr2 = new Roue(120);

        Roue roue_pt1 = new Roue();
        Roue roue_pt2 = new Roue();
    /*
        System.out.println(roue_gr1.toString());
        System.out.println(roue_pt1.toString());
        System.out.println(roue_gr2.toString());
        System.out.println(roue_pt2.toString());
    */

        Cabine cabine_bleu = new Cabine(30, "Blue");
        System.out.println(cabine_bleu.toString());


        Tracteur t1 = new Tracteur(cabine_bleu, roue_gr1, roue_gr2, roue_pt1, roue_pt2);

        Tracteur t2 = t1;
        Tracteur t3 = new Tracteur(cabine_bleu, roue_gr1, roue_gr2, roue_pt1, roue_pt2);

        // Reference to same instance
        t2.peindre("Rouge");
        System.out.println("Couleur de t1:"+ t1.toString());
        System.out.println("Couleur de t2:"+ t2.toString());

        // Avoiding that error !
        System.out.println("----------Cloning() ----------");
        t2 = t1.clone();
        t2.peindre("Noir");
        System.out.println("Couleur de t1:"+ t1.toString());
        System.out.println("Couleur de t2:"+ t2.toString());

    }
}
