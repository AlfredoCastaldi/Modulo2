public class Triangolo implements Forma{

    private double altezza;
    private double base;

    public Triangolo(double base, double altezza){

       this.base = base;
       this.altezza = altezza;

    }

    @Override
    public double getArea() {
        return base * altezza /2;
    }
}
