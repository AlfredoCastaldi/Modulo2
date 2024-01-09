public class Forma {
    protected double lato;
    protected double altezza;
    protected double base;

    public Forma(double lato,double altezza, double base){

        this.lato = lato;
        this.altezza = altezza;
        this.base = base;
    }
    public Forma(double altezza, double base){

        this.altezza = altezza;
        this.base = base;
    }

    public double getArea(){
        return this.altezza * this.base;
    }
}
