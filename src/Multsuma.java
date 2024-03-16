public class Multsuma {

    public double multsuma(double a, double b , double c) {
        return ((a*b) + c);
    }
    public static void main (String[] args) {
        Multsuma multsuma1 = new Multsuma();
        System.out.println(multsuma1.multsuma(1.0, 2.0, 3.0));
    }
}