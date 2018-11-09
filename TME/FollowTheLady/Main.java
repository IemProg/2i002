public class Main{
    public static void main(String[] args){
        System.out.println("Crée Jeu classe !");
        Jeu jeu1 = new Jeu();
        int cmpt = 0;
/*
        System.out.println("Mélanger aléatoirement 10 fois ! ");
        jeu1.echanger(0, 2);
        jeu1.melanger(10);

        System.out.println(jeu1);
*/

        for (int k = 0; k < 1000; k++){
			jeu1.melanger(10);
			int i = (int)(Math.random() * 3);
			if (jeu1.choisir(i)){
				System.out.println("You win!");
                System.out.println("Emplacement Choisi est: "+i);
				cmpt++;
			}else{
                System.out.println("You lost!");
                System.out.println("Emplacement Choisi est: "+i);
            }

            //System.out.println(jeu1);
            System.out.println("------------------------------------");
		}
		System.out.println("Number of Wins / 1000 tirages: "+cmpt);

    }
}
