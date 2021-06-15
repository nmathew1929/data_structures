package part02_lists._01Walrus;

public class Walrus {
    public int weight;
    public double tuskSize;

    public Walrus(int weight, double tuskSize) {
        this.weight = weight;
        this.tuskSize = tuskSize;
    }

    @Override
    public String toString() {
        return "Walrus{" +
                "weight=" + weight +
                ", tuskSize=" + tuskSize +
                '}';
    }

    public static void main(String[] args) {
        Walrus a = new Walrus(1000, 8.3);
        Walrus b;
        b = a;
        b.weight = 5; //does this change to b affect a? yes
        System.out.println(a);
        System.out.println(b);

       int x = 5 ;
       int y;
       y = x;
       x = 2;
       System.out.println("x is: " + x);
       System.out.println("y is: " + y);

       //Why is Walrus different from x?
        //Walrus is a reference type while, int is a primitive type.
        // Both of them store their values differently.
    }
}
