public class Tableu{
    public static void main(String[] args){
        int [] t1 = {1,2,3}; // syntaxe reduite correcte (a connaitre)
        int [] t2 = {1,2,3};
        int [] t3=t1;
        System.out.println(t1 == t2); System.out.println(t1 == t3);
    }
}