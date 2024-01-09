public class Rettangolo implements Forma{
    private double altezza;
    private double base;

    public Rettangolo(double base, double altezza){

        this.base = base;
        this.altezza = altezza;

    }

    @Override
    public double getArea() {
        return base * altezza;
    }
}


