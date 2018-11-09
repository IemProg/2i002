public class Animal {
    protected int x, y ;
    protected String type;

    public Animal(int x, int y, String type){
        this.x = x; this.y = y;
        this.type = type;
    }

    public double distance(Animal a){
        double distance;
        distance = Math.sqrt(Math.pow((this.x - a.x), 2)+ Math.pow((this.y - a.y),2));
        return distance;
    }

    public void move(int i, int j){
        this.x += i;
        this.y += j;
    }
    //We cant signature it as abstract method because it will require to signature our class to abstract also;
    public void move(Animal a){};

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getType() {
        return type;
    }
}
