public class Test {
    public static void main(String [] args){
        /*
        Departement dept1 = new Departement();
        Departement dept2 = new Departement();

        Departement plaque3 = new Departement(1);
        Departement plaque4 = new Departement(1);
        Departement plaque5 = new Departement(2);
        Departement plaque6 = new Departement(2);


        System.out.println("dept1, Plaque:1 : "+dept1.getPlaque());
        System.out.println("dept1, Plaque:2 : "+dept1.getPlaque());
        System.out.println("dept1, Plaque:3 : "+dept1.getPlaque());
        System.out.println("dept2, Plaque:1 : "+dept2.getPlaque());
        System.out.println("dept2, Plaque:2 : "+dept2.getPlaque());
        System.out.println("dept2, Plaque:3 : "+dept2.getPlaque());


        for (int i=1; i < 2500;i++){
                System.out.println("dept1, Plaque: " + dept1.getPlaque());
                System.out.println("dept2, Plaque: " + dept2.getPlaque());
        }
        */

        Point p1 = new Point(1 ,2);
        Point p2 = new Point(1 ,2);
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p1));
    }
}
